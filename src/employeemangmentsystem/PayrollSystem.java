package employeemangmentsystem;

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
    public void payDepartmentSalaries(Department department){
        int total=department.getTotalSalaries();
        if(balance>=total){
            int salary;
            for(Employee em:department.getEmpArray()){
                salary=em.calcSalary();
                em.deposit(salary);
            }
            int departmentTaxes=(int)(taxes*total);
            balance-=total;
            balance-=departmentTaxes;
            JOptionPane.showMessageDialog(null, "Salaries payed successfully: " + total+" EGP and taxes: "+departmentTaxes+"\n Remaining balance: "+balance);
        }
        else{
            JOptionPane.showMessageDialog(null, "balance isn't enough");
        }
    }
    
}
