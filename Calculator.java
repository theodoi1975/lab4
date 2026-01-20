/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

public class Calculator {

    public int add(int a, int b) { return a + b; }

    public double add(double a, double b) { return a + b; }

    public int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2.5, 3.5));
        System.out.println(cal.add(1, 2, 3));
    }
}
