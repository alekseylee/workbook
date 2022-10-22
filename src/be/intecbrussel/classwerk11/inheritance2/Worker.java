package be.intecbrussel.classwerk11.inheritance2;

public class Worker extends Person {
    public Worker(String name, int age, String profession) {
        super(name, age, profession);
    }
    public void eat(){
        System.out.println("Worker is eating");
    }
    public void sleep(){
        System.out.println("Worker is sleeping");
    }
    public void work(){
        System.out.println("Worker is working");
    }
}
