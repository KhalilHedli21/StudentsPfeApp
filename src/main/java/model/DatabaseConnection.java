package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:8889/student_groups";
    private static final String USER = "root"; // Default MAMP user
    private static final String PASSWORD = "root"; // Default MAMP password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
