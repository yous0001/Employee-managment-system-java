
package employeemangmentsystem;
import java.util.ArrayList;
public abstract class Department {
    
    private int id;
    private String name;
    protected ArrayList <Employee> empArray;
    
    public Department(int id, String name){
        this.id = id;
        this.name = name;
        empArray=new ArrayList<>();
        Company.company.addDepartment(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmployee(Employee employee) {
        if(employee.getDepartment()==null){
            employee.setDepartment(this);
            empArray.add(employee);
        }
        else{
            System.out.println("employee can't be in more than 1 department");
        }
        
    }
    
    public void removeEmployeeBySSN(String employeeSSN) {
        Employee em=empArray.stream().filter(emp -> emp.getSsn() == employeeSSN).findFirst().orElse(null);
        if (em != null) {
            empArray.remove(em);
            em.setDepartment(null);
            System.out.println("Employee with ssn " + employeeSSN + " removed from "+this.name+" .");
        } else {
            System.out.println("Employee with ssn " + employeeSSN + " not found in "+this.name+" .");
        }
    }
    
    public void removeEmployee(int index) {
        Employee em=empArray.get(index);
        if (em != null) {
            empArray.remove(em);
            em.setDepartment(null);
            System.out.println("Employee with ssn " + em.getSsn() + " removed from "+this.name+" .");
        } else {
            System.out.println("Employee with ssn " + em.getSsn() + " not found in "+this.name+" .");
        }
        
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", empArray=" + empArray + '}';
    }

    public ArrayList<Employee> getEmpArray() {
        return empArray;
    }
    
    
    
    public int countEmployees(){
        return empArray.size();
    }
    public int getTotalSalaries(){
        int total=0;
        for(Employee em:empArray){
            total+=em.calcSalary();
        }
        return total;
    }
    abstract public void displayEmployees();
    
}
