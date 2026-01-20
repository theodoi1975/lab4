/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

class CPU {
    String brand;
    double speed;
}

public class Computer {
    String model;
    CPU cpu;

    public Computer(String model, CPU cpu) {
        this.model = model;
        this.cpu = cpu;
    }

    public void displayInfo() {
        System.out.println(model + " - " + cpu.brand + " - " + cpu.speed);
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.brand = "Intel";
        cpu.speed = 3.2;

        Computer com = new Computer("Dell", cpu);
        com.displayInfo();
    }
}
