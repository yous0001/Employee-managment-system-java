/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
 public class ContractorEmployee{
    private int taskRate;
    private int tasks;
    private String name;
    private Gender gender;
    private String ssn;
    Type type;
    private Department department;
    private int balance;

    public ContractorEmployee(int taskRate, int tasks, String name, Gender gender, String ssn, Type type, Department department, int balance) {
        this.taskRate = taskRate;
        this.tasks = tasks;
        this.name = name;
        this.gender = gender;
        this.ssn = ssn;
        this.type = type;
        this.department = department;
        this.balance = balance;
    }

    
    public ContractorEmployee(ContractorEmployee emp){
        this.taskRate = emp.taskRate;
        this.tasks = emp.tasks;
        this.name = emp.name;
        this.gender = emp.gender;
        this.ssn = emp.ssn;
        this.type = emp.type;
        this.department = emp.department;
        this.balance = emp.balance;
    }
    
    public ContractorEmployee clone(){
        return new ContractorEmployee(this);
    }

   
    public int calcSalary() {
        return taskRate*tasks;
    }

    public int getTaskRate() {
        return taskRate;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTaskRate(int taskRate) {
        this.taskRate = taskRate;
    }

    public int getTasks() {
        return tasks;
    }

    public void setTasks(int tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "ContractorEmployee{" + "taskRate=" + taskRate + ", tasks=" + tasks + ", name=" + name + ", gender=" + gender + ", ssn=" + ssn + ", type=" + type + ", department=" + department + ", balance=" + balance + '}';
    }

    
    public void addTasks(int tasks) {
        this.tasks += tasks;
    }
    
     public void deposit(int balance){
        this.balance+=balance;
    }
    public void withdraw(int balance){
        this.balance-=balance;
    }

    void displayData() {
        System.out.println(this.toString());
    }
    
    


}
