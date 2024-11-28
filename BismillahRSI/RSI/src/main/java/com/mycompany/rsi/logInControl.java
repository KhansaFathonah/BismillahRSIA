/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class logInControl {
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set parameters untuk query
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Eksekusi query
            ResultSet rs = stmt.executeQuery();

            // Periksa apakah user ditemukan
            if (rs.next()) {
                System.out.println("Login successful!");
                return true; // Login berhasil
            } else {
                System.out.println("Invalid username or password.");
                return false; // Login gagal
            }
        } catch (SQLException e) {
            System.err.println("An error occurred while logging in: " + e.getMessage());
            return false; // Terjadi kesalahan
        }
    }

    // Method untuk logout
    public void logout() {
        // Misalnya, jika aplikasi menggunakan sesi, lakukan reset sesi di sini
        System.out.println("Logout successful!");
        // Reset atau hapus sesi (Jika menggunakan sesi dalam aplikasi)
    } 
}
