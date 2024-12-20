/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
public class EmployeeAdapter extends Employee{
    ContractorEmployee instance=null;
    
    public EmployeeAdapter(ContractorEmployee emp){
        instance =emp;
    }

    @Override
    public int calcSalary() {
        return instance.calcSalary();
    }

    @Override
    public void displayData() {
        instance.displayData();
    }
       

    @Override
    public String getName() {
        return instance.getName();
    }
    @Override
    public void setName(String name) {
        instance.setName(name);
    }
    @Override
    public Gender getGender() {
        return instance.getGender();
    }
    @Override
    public String getSsn() {
        return instance.getSsn();
    }
    @Override
    public void setSsn(String ssn) {
        instance.setSsn(ssn);
    }
    @Override
    public void deposit(int balance){
        instance.deposit(balance);
    }
    @Override
    public void withdraw(int balance){
        instance.withdraw(balance);
    }
    @Override
    public String toString() {
        return instance.toString();
    } 
    
}
