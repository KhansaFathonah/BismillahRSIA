package com.mycompany.rsi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements AutoCloseable {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/parenta";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private Connection connection;

    // Constructor untuk membuka koneksi
    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.err.println("Koneksi ke database gagal: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC tidak ditemukan.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    // Method untuk menambah agenda
    public boolean tambahAgenda(String namaAgenda, String waktuAgenda, java.sql.Date tanggalAgenda) {
        if (namaAgenda == null || waktuAgenda == null || tanggalAgenda == null) {
            System.err.println("Input tidak valid: nama, waktu, atau tanggal tidak boleh null.");
            return false;
        }

        String query = "INSERT INTO agenda (nama, waktu, tanggal) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, namaAgenda);
            stmt.setString(2, waktuAgenda);
            stmt.setDate(3, tanggalAgenda);
            return stmt.executeUpdate() > 0; // True jika berhasil ditambahkan
        } catch (SQLException e) {
            System.err.println("Gagal menambahkan data: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
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


    // Method untuk menghapus agenda berdasarkan nama, waktu, dan tanggal
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

    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Koneksi ke database ditutup.");
            }
        } catch (SQLException e) {
            System.err.println("Gagal menutup koneksi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
