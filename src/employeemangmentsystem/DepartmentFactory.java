
package employeemangmentsystem;

import javax.swing.JOptionPane;


public class DepartmentFactory {
    public static Department CreateDepartment(String type,int id, String name){
        try{
            switch(type.toLowerCase()){
                case "it":
                    return new ITDepartment(id,name);
                case "hr":
                return new HRDepartment(id,name);
                case "finance":
                return new FinanceDepartment(id,name);
                default:
                    JOptionPane.showMessageDialog(null, "invalid type");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "unexpected error :"+ex.getMessage());
        }
        return null;
    }
}
