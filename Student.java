/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;
public class Student {
    private String id;
    private String name;
    private double score;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public boolean isPass() {
        return score >= 5;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Pass: " + isPass());
    }

    public static void main(String[] args) {
        Student sv = new Student();
        sv.setId("SV01");
        sv.setName("Le Van Bac");
        sv.setScore(7);

        sv.display();
    }
}
