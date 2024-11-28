/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class logInControl {

    private DatabaseConnection databaseConnection;

    public logInControl() {
        databaseConnection = new DatabaseConnection();
    }

    public boolean validateLogin(String email, String password) {
        boolean isValid = false;

        try {
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT * FROM ADMINISTRATOR WHERE EMAIL = ? AND PASSWORD = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                // Jika ditemukan, berarti email dan password valid
                isValid = true;
            }

            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
    
    public boolean validatePR(String email, String password) {
        boolean isValid = false;

        try {
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT * FROM PENGGUNA_REGULER WHERE EMAIL = ? AND PASSWORD = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                // Jika ditemukan, berarti email dan password valid
                isValid = true;
            }

            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
