package be.intecbrussel.classwerk11.inheritance2;

public class Teacher extends Person {
    public Teacher(String name, int age, String profession) {
        super(name, age, profession);
    }
    public void eat() {
        System.out.println("Teacher is eating");
    }
    public void sleep() {
        System.out.println("Teacher is sleeping");
    }
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
