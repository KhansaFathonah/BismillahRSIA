/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Asus
 */
public class ControlAgenda implements AutoCloseable {
    private Connection connection;
    
    public ControlAgenda() throws SQLException {
        this.connection = DatabaseConnection.getConnection(); 
    }
    
    public boolean tambahAgenda(String namaAgenda, String waktuAgenda, java.sql.Date tanggalAgenda) {
        if (namaAgenda == null || waktuAgenda == null || tanggalAgenda == null) {
            System.err.println("Nama, waktu, atau tanggal tidak boleh null.");
            return false;
        }

        String query = "INSERT INTO agenda (nama, waktu, tanggal) VALUES (?, ?, ?)";

        // Gunakan try-with-resources untuk memastikan koneksi tertutup dengan benar
        try ( Connection conn = DatabaseConnection.getConnection();  PreparedStatement stmt = conn.prepareStatement(query)) {

            // Set parameter untuk PreparedStatement
            stmt.setString(1, namaAgenda);
            stmt.setString(2, waktuAgenda);  
            stmt.setDate(3, tanggalAgenda);

            // Eksekusi query dan periksa hasil
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Agenda berhasil ditambahkan.");
                return true;
            } else {
                System.err.println("Gagal menambahkan agenda.");
                return false;
            }

        } catch (SQLException e) {
            // Tangani error SQL dengan memberikan pesan yang lebih detail
            System.err.println("Terjadi kesalahan saat menyisipkan data: " + e.getMessage());
            System.err.println("Error kode SQLState: " + e.getSQLState());
            System.err.println("Error kode vendor: " + e.getErrorCode());
            e.printStackTrace(); // Log stack trace untuk debugging
            return false;
        }
    }
    
    
    public boolean isAgendaExists(String namaAgenda, String waktuAgenda, java.util.Date tanggalAgenda) {
        if (namaAgenda == null || waktuAgenda == null || tanggalAgenda == null) {
            System.err.println("Input tidak valid: nama, waktu, atau tanggal tidak boleh null.");
            return false;
        }

        String query = "SELECT COUNT(*) FROM agenda WHERE nama = ? AND waktu = ? AND tanggal = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, namaAgenda);
            stmt.setString(2, waktuAgenda);
            stmt.setDate(3, new java.sql.Date(tanggalAgenda.getTime()));

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; // True jika data ditemukan
                }
            }
        } catch (SQLException e) {
            System.err.println("Gagal memeriksa keberadaan data: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateAgenda(String prevNama, String prevWaktu, java.util.Date prevTanggal,
            String newNama, String newWaktu, java.util.Date newTanggal) {
        if (prevNama == null || prevWaktu == null || prevTanggal == null
                || newNama == null || newWaktu == null || newTanggal == null) {
            System.err.println("Input tidak valid: semua parameter harus diisi.");
            return false;
        }

        if (!isAgendaExists(prevNama, prevWaktu, prevTanggal)) {
            System.err.println("Data yang akan diperbarui tidak ditemukan di database.");
            return false;
        }

        String updateQuery = "UPDATE agenda SET nama = ?, waktu = ?, tanggal = ? "
                + "WHERE nama = ? AND waktu = ? AND tanggal = ?";

        try (PreparedStatement stmt = connection.prepareStatement(updateQuery)) {
            // Mengatur nilai untuk parameter baru
            stmt.setString(1, newNama);
            stmt.setString(2, newWaktu);
            stmt.setDate(3, new java.sql.Date(newTanggal.getTime()));  // Pastikan tanggal dikonversi dengan benar
            stmt.setString(4, prevNama);
            stmt.setString(5, prevWaktu);
            stmt.setDate(6, new java.sql.Date(prevTanggal.getTime())); // Pastikan tanggal sebelumnya juga dikonversi

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Agenda berhasil diperbarui.");
                return true;  // Berhasil memperbarui
            } else {
                System.err.println("Tidak ada data yang diperbarui, periksa query dan data.");
                return false; // Tidak ada baris yang diperbarui
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengupdate data: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean hapusAgenda(String namaAgenda, String waktuAgenda, java.util.Date tanggalAgenda) {
        if (namaAgenda == null || waktuAgenda == null || tanggalAgenda == null) {
            System.err.println("Input tidak valid: nama, waktu, atau tanggal tidak boleh null.");
            return false;
        }

        String query = "DELETE FROM agenda WHERE nama = ? AND waktu = ? AND tanggal = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, namaAgenda);
            stmt.setString(2, waktuAgenda);
            stmt.setDate(3, new java.sql.Date(tanggalAgenda.getTime()));  // Konversi java.util.Date ke java.sql.Date

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Agenda berhasil dihapus.");
                return true; 
            } else {
                System.err.println("Tidak ada data yang cocok untuk dihapus.");
                return false; 
            }
        } catch (SQLException e) {
            System.err.println("Gagal menghapus data: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
    public String showDateDetails(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(date);
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = sdf.format(date);

        // Mengambil detail agenda untuk tanggal tertentu
        String detail = getDetailsForDate(date2);
        return "Detail Agenda Tanggal " + formattedDate + ":\n" + detail;
    }
    
    public List<String[]> tampilAgenda() {
        List<String[]> data = new ArrayList<>();
        String query = "SELECT * FROM agenda";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String[] row = {
                        String.valueOf(rs.getInt("id")),
                        rs.getString("nama"),
                        rs.getString("waktu"),
                        rs.getDate("tanggal").toString()
                };
                data.add(row);
            }
        } catch (SQLException e) {
            System.err.println("Gagal menampilkan data: " + e.getMessage());
            e.printStackTrace();
        }
        return data;
    }

    // Method untuk mendapatkan detail agenda berdasarkan tanggal
    public String getDetailsForDate(String date) {
        List<String[]> result = new ArrayList<>();
        StringBuilder kalimat = new StringBuilder();

        for (String[] row : tampilAgenda()) {
            String nama = row[1];
            String waktu = row[2];
            String tanggal = row[3];

            if (tanggal.equals(date)) {
                result.add(new String[] {nama, waktu});
            }
        }

        if (result.isEmpty()) {
            kalimat.append("Tidak ada agenda di tanggal ini");
        } else {
            for (String[] entry : result) {
                kalimat.append("-> Nama  : ").append(entry[0])
                        .append("\n    Waktu  : ").append(entry[1]).append("\n");
            }
        }
        return kalimat.toString();
    }
    
    @Override
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}