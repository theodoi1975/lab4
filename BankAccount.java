/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap tien thanh cong: " + amount);
        } else {
            System.out.println("So tien nap khong hop le!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Khong du so du!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Rut tien thanh cong: " + amount);
        }
    }

    public void displayInfo() {
        System.out.println("So TK: " + accountNumber);
        System.out.println("Chu TK: " + ownerName);
        System.out.println("So du: " + balance);
    }

    // Setter
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
}
