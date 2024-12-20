/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yousef
 */
public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;
    private final String url="jdbc:mysql://localhost:3306/employeemanagmentdb";
    private final String user="yousef";
    private final String password="1234";
    
     private DatabaseConnectionManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            System.err.println("Database Driver not found: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Failed to connect to the database: " + ex.getMessage());
        }
    }


    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }


    public Connection getConnection() {
        return connection;
    }
        

}
