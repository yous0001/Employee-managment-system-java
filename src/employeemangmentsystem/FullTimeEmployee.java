
package employeemangmentsystem;


public class FullTimeEmployee extends Employee{
   
    
    public FullTimeEmployee(String name, Gender gender, String ssn,String email,String password, int baseSalary) {
        super(name,Type.full, gender, ssn,email,password,baseSalary);
        this.type=Type.part;        
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + '}';
    }

    public int calcSalary(){
        return super.getBaseSalary();
    }


    @Override
    public void displayData() {
        System.out.println(super.toString()+"\n"+this.toString()+"\n salary ="+calcSalary());
        
        
    }

    
    
}
