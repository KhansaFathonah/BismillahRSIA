package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/parenta";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load and register the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establish the connection
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Database connection established.");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to establish database connection.");
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
