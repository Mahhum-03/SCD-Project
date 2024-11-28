package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/home_decor?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // Database username
    private static final String PASSWORD = ""; // Database password (default is empty for root in XAMPP)
    
    public static Connection getConnection() throws SQLException {
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new SQLException("Database connection failed", e);
        }
    }
}
