/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
public class FinanceDepartment extends Department{

    public FinanceDepartment(int id, String name) {
        super(id, name);
    }
    private FullTimeEmployee Manager;

    public void displayEmployees(){
        if(empArray.isEmpty()){
            System.out.println("no employees added yet to "+super.getName()+" Department");
            
        }
        else{
            System.out.println("Employees in  "+super.getName()+" Department of Finance:");
            for(Employee e :empArray){
                e.displayData();
                System.out.println("");
            }
            
        }
    }
}
