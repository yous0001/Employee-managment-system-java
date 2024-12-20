package employeemangmentsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PayrollSystem {
    private int balance;
    private static PayrollSystem payroll;
    private final double taxes=0.1;
    
    private PayrollSystem(){
        
    }
    public static PayrollSystem getInstance(){
        if(payroll==null){
            payroll=new PayrollSystem();
        }
        return payroll;
    }
    public void deposit(int balance){
        this.balance+=balance;
    }
    public void withdraw(int balance){
        this.balance-=balance;
    }
    public void paySalaries(){
        String query="SELECT SUM(base_salary) AS TotalSalaries FROM employee WHERE 1";
        
        Connection con = DatabaseConnectionManager.getInstance().getConnection();
        try (Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int total=rs.getInt("TotalSalaries");
                JOptionPane.showMessageDialog(null,"Total salaries are:"+total);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
