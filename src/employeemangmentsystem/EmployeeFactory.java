
package employeemangmentsystem;
import javax.swing.JOptionPane;

public class EmployeeFactory {
        public static Employee createEmployee(String type,String name, Gender gender, String ssn,String email,String password,int baseSalary){
        try{
            switch(type.toLowerCase()){
                case "full":
                    return new FullTimeEmployee(name,gender,ssn,email,password,baseSalary);
                case "part":
                    return new PartTimeEmployee(name,gender,ssn,email,password,baseSalary);
                default:
                    JOptionPane.showMessageDialog(null, "invalid type");
                    return null;   
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Unexpected error: " + ex.getMessage());
        }
        return null;
        
    }


}
