package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;

        try {
            // 1. Registre driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. create connection
            String path = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "Kashyap@9798";
            con = DriverManager.getConnection(path, userName, password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }
}
