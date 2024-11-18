/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

/**
 *
 * @author Asus
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Webinar {
    private String judul;
    private String deskripsi;
    private String linkPendaftaran;
    private Date tanggal;
    private String waktu;
    
    public Webinar(String judul, String deskripsi, String linkPendaftaran, Date tanggal, String waktu) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.linkPendaftaran = linkPendaftaran;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }
     
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setLinkPendaftaran(String linkPendaftaran) {
        this.linkPendaftaran = linkPendaftaran;
    }
    
    public String getLinkPendaftaran() {
        return linkPendaftaran;
    }
    
    public void setTanggal(java.util.Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public java.util.Date getTanggal() {
        return tanggal;
    }
    
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    
    public String getWaktu() {
        return waktu;
    }

    public void insertWebinar() {
        String sql = "INSERT INTO webinar (judul, deskripsi, link_pendaftaran, tanggal, waktu) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, judul);
            stmt.setString(2, deskripsi);
            stmt.setString(3, linkPendaftaran);
            stmt.setDate(4, new java.sql.Date(tanggal.getTime())); // Konversi java.util.Date ke java.sql.Date
            stmt.setString(5, waktu);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Webinar berhasil ditambahkan ke database.");
            }
        } catch (SQLException e) {
            System.err.println("Terjadi kesalahan saat menyisipkan data: " + e.getMessage());
        }
    }
}
