/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVINDA HERAST
 */
public class tampilanWebinar extends Webinar {
    
    public tampilanWebinar(String judul, String deskripsi, String linkPendaftaran, Date tanggal) {
        super(judul, deskripsi, linkPendaftaran, tanggal);
    }
    
    public static ArrayList<Webinar> getAllRecords(){
        ArrayList<Webinar> arrayList = new ArrayList<>();
        String sql = "SELECT id, judul, hari_tgl FROM webinar"; 
        
    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Webinar webinar = new Webinar();
            webinar.setId(rs.getInt("id"));
            webinar.setJudul(rs.getString("judul"));
            webinar.setTanggal(rs.getDate("hari_tgl"));

            arrayList.add(webinar); 
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error saat mengambil data: " + e.getMessage());
    }
    return arrayList; 
}   
}
