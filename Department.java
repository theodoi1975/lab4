/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

class Employee2 {
    String id;
    String name;
}

public class Department {
    String deptName;
    Employee2 employee;

    public void display() {
        System.out.println("Phong: " + deptName);
        System.out.println("Nhan vien: " + employee.name);
    }

    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.id = "E02";
        e.name = "Lan";

        Department d = new Department();
        d.deptName = "IT";
        d.employee = e;

        d.display();
    }
}
