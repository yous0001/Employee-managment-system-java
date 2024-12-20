
package employeemangmentsystem;

import java.util.ArrayList;


public class Company {
    private Company(){
        departmentArray=new ArrayList <>();
    }
    public static Company company=new Company();
    protected ArrayList <Department> departmentArray;
    
    public void addDepartment(Department department) {
            departmentArray.add(department);
        
    }
    public void removeDepartment(int index) {
        Department department=departmentArray.get(index);
        departmentArray.remove(department);
            
        
    }
    public void displayDepartments(){
        for(Department department:departmentArray){
            System.out.println(department.toString());         
        }
    }
}
