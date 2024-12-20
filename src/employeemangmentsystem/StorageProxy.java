/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangmentsystem;

/**
 *
 * @author yousef
 */
public class StorageProxy {
    public static void insertEmployee(Employee admin,Employee emp){
        if("admin".equals(admin.getRole())){
            Storage.getInstance().insertEmployee(emp);
        }
    }
}
