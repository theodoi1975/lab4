/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

class Address {
    String street;
    String city;
}

public class StudentAddress {
    String id;
    String name;
    Address address;

    public void display() {
        System.out.println(id + " - " + name);
        System.out.println(address.street + " - " + address.city);
    }

    public static void main(String[] args) {
        Address ad = new Address();
        ad.street = "Tran Phu";
        ad.city = "Ha Noi";

        StudentAddress sv = new StudentAddress();
        sv.id = "SV02";
        sv.name = "Nam";
        sv.address = ad;

        sv.display();
    }
}
