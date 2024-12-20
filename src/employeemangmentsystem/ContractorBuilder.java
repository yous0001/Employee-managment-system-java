/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
public class ContractorBuilder {
    private int taskRate;
    private int tasks;
    private String name;
    private Gender gender;
    private String ssn;
    Type type;
    private Department department;
    private int balance;
    public ContractorBuilder(){
        
    }
    public ContractorBuilder taskRate(int taskRate){
        this.taskRate=taskRate;
        return this;
    }
    public ContractorBuilder tasks(int tasks){
        this.tasks=tasks;
        return this;
    }
    public ContractorBuilder name(String name){
        this.name=name;
        return this;
    }
    public ContractorBuilder gender(Gender gender){
        this.gender=gender;
        return this;
    }
    public ContractorBuilder ssn(String ssn){
        this.ssn=ssn;
        return this;
    }
    public ContractorBuilder type(Type type){
        this.type=type;
        return this;
    }
    public ContractorBuilder department(Department department){
        this.department=department;
        return this;
    }
    public ContractorBuilder balance(int balance){
        this.balance=balance;
        return this;
    }
    public ContractorEmployee build(){
        return new ContractorEmployee( taskRate,  tasks,  name,  gender,  ssn,  type,  department,  balance);
    }
}
