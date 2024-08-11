package com.example.got_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/gotdb";
    private static final String USER = "root";
    private static final String PASSWORD = "andraus66";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão estabelecida!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
