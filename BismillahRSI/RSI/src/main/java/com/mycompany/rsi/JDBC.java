/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JDBC {
    private static Connection conn;

    // Method untuk mendapatkan koneksi ke database
    public static Connection getKoneksi() {
        String host = "jdbc:mysql://localhost:3306/parenta";
        String user = "root";
        String pass = "";

        try {
            conn = DriverManager.getConnection(host, user, pass);
            System.out.println("Koneksi ke database berhasil!");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        getKoneksi();
    }
}