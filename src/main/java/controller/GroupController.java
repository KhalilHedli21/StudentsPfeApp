package controller;

import model.Group;
import model.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/group")

public class GroupController extends HttpServlet {
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String supervisor = request.getParameter("supervisor");
        String level = request.getParameter("level");

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO groups (first_name, last_name, supervisor, level) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, supervisor);
            statement.setString(4, level);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("view.jsp"); // Redirect to view page after submission
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to retrieve and display groups from the database can be added here.
    }
}
