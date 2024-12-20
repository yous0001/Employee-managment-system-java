
package employeemangmentsystem;

enum Gender{male,female}
enum Type{full,part}
public abstract class Employee {
    private String name;
    private Gender gender;
    private String ssn;
    Type type;
    private Department department;
    private int balance;
    private String email;
    private String password;
    private String role;
    private int baseSalary;
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public Employee(){
        
    }
    public Employee(String name,Type type, Gender gender, String ssn,String email,String password,int baseSalary) {

        this.name = name;
        this.gender = gender;
        this.ssn = ssn;
        this.balance=0;
        this.email=email;
        this.password=password;
        role="user";
        this.baseSalary=baseSalary;
    }
    public String getRole() {
        return role;
    }

    public void setAdmin() {
        this.role = "admin";
    }
    public void setUser() {
        this.role = "user";
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Type getType() {
        return type;
    }
    public String getTypeName() {
        return type.name();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void deposit(int balance){
        this.balance+=balance;
    }
    public void withdraw(int balance){
        this.balance-=balance;
    }
    @Override
    public String toString() {
        return "Employee{"  + " name=" + name + ", gender=" + gender + ", ssn=" + ssn + '}';
    }
    public abstract int calcSalary();
    public abstract void displayData();
    
    
    
}
