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

public class JadwalAgenda {
    private int id;
    private String nama;
    private String waktu;
    private java.util.Date tanggal;

    public JadwalAgenda(int id, String nama, String waktu, java.util.Date tanggal) {
        this.id = id;
        this.nama = nama;
        this.waktu = waktu;
        this.tanggal = tanggal;
    }

    public void simpanKeDatabase() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO AGENDA (ID, NAMA, TANGGAL, WAKTU) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nama);
            preparedStatement.setDate(3, new java.sql.Date(tanggal.getTime()));
            preparedStatement.setString(4, waktu);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Agenda berhasil disimpan ke database.");
        } catch (SQLException e) {
            System.err.println("Gagal menyimpan agenda ke database: " + e.getMessage());
        }
    }
}
