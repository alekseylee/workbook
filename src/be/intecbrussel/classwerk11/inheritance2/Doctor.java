package be.intecbrussel.classwerk11.inheritance2;

public class Doctor extends Person {
    public Doctor(String name, int age, String profession) {
        super(name, age, profession);
    }
    public void eat(){
        System.out.println("Doctor is eating");
    }
    public void sleep(){
        System.out.println("Doctor is sleeping");
    }
    public void work() {
        System.out.println("Doctor is healing");
    }
}
