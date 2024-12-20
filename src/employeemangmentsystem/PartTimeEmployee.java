/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, Gender gender, String ssn,String email,String password, int baseSalary) {
        super(name,Type.part, gender, ssn,email,password,baseSalary);
        this.type=Type.part;
    }



    @Override
    public int calcSalary(){
        return super.getBalance() ;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + '}';
    }
    @Override
    public void displayData() {
        System.out.println(super.toString()+"\n"+this.toString()+"\n salary ="+calcSalary());
        
        
    }

}
