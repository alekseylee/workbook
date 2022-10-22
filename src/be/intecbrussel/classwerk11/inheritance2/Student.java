package be.intecbrussel.classwerk11.inheritance2;

public class Student extends Person {
    public Student(String name, int age, String profession) {
        super(name, age, profession);
    }

    public void work() {
        System.out.println("Student is studying");
    }
    public void eat() {
        System.out.println("Student is eating");
    }
    public void sleep() {
        System.out.println("Student is sleeping");
    }
}
