/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yousef
 */
public class Storage {

    private static Storage instance;


    private Storage() {

    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void insertEmployee(Employee emp) {
    String query = "INSERT INTO `employee`(`name`, `email`, `password`, `base_salary`, `gender`, `type`, `ssn`, `department`, `role`) "
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        Connection con = DatabaseConnectionManager.getInstance().getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(query);  // Removed extra parenthesis

        // Set parameters
        preparedStatement.setString(1, emp.getName());
        preparedStatement.setString(2, emp.getEmail());
        preparedStatement.setString(3, emp.getPassword());
        preparedStatement.setDouble(4, emp.getBaseSalary());
        preparedStatement.setString(5, emp.getGender().name());
        preparedStatement.setString(6, emp.getTypeName());
        preparedStatement.setString(7, emp.getSsn());
        preparedStatement.setString(8, emp.getDepartment() != null ? emp.getDepartment().getName() : "N/A");
        preparedStatement.setString(9, emp.getRole());

        // Execute the query
        int addedRows = preparedStatement.executeUpdate();
        if (addedRows == 1) {
            JOptionPane.showMessageDialog(null, "User (" + emp.getName() + ") created successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "User creation failed.");
        }

        // Close the statement and connection
        preparedStatement.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}
}
