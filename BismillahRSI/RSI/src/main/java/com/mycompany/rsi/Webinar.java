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
import java.sql.Date;


public class Webinar {
    private int id;
    private String judul;
    private String deskripsi;
    private String link_daftar;
    private Date hari_tgl; 
    
    public Webinar(){}
    
    public Webinar(String judul, String deskripsi, String linkPendaftaran, Date tanggal) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.link_daftar = linkPendaftaran;
        this.hari_tgl = tanggal;
    }
    
    public Webinar(int id, String judul, String deskripsi, String linkPendaftaran, Date tanggal) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.link_daftar = linkPendaftaran;
        this.hari_tgl = tanggal;
    }
    
    public Webinar(int id) {
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
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
        this.link_daftar = linkPendaftaran;
    }
    
    public String getLinkPendaftaran() {
        return link_daftar;
    }
    
    public void setTanggal(java.sql.Date tanggal) {
        this.hari_tgl = tanggal;
    }
    
    public java.util.Date getTanggal() {
        return hari_tgl;
    }
    
    public void insertWebinar(String judul, String deskripsi, String link_daftar, java.util.Date hari_tgl){
        {
        String sql = "INSERT INTO webinar (judul, deskripsi, link_daftar, hari_tgl) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, judul);
            stmt.setString(2, deskripsi);
            stmt.setString(3, link_daftar);
            stmt.setDate(4, new java.sql.Date(hari_tgl.getTime())); 

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Webinar berhasil ditambahkan ke database.");
            }
        } catch (SQLException e) {
            System.err.println("Terjadi kesalahan saat menyisipkan data: " + e.getMessage());
             }
        }
    }
    
    public void updateWebinar(int id) {
    String sql = "UPDATE webinar SET judul = ?, deskripsi = ?, link_daftar = ?, hari_tgl = ? WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
      
            stmt.setString(1, judul);
            stmt.setString(2, deskripsi);
            stmt.setString(3, link_daftar); 
            stmt.setDate(4, new java.sql.Date(hari_tgl.getTime())); 
            stmt.setInt(5, id); 

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Webinar dengan ID " + id + " berhasil diperbarui.");
            } else {
                System.out.println("Webinar dengan ID " + id + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("Terjadi kesalahan saat memperbarui data: " + e.getMessage());
        }
    }
    
    public void deleteWebinar(int id) {
    String sql = "DELETE FROM webinar WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
      
            stmt.setInt(1, id); 

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Webinar dengan ID " + id + " berhasil dihapus.");
            } else {
                System.out.println("Webinar dengan ID " + id + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("Terjadi kesalahan saat menghapus data: " + e.getMessage());
        }
    }
    
}
