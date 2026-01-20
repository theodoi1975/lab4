/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

/**
 *
 * @author Admin
 */
public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = (salary < 0) ? 0 : salary;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("An");
        Employee e2 = new Employee("E01", "Binh", -2000);

        e1.display();
        e2.display();
    }
}
