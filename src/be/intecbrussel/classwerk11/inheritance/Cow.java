package be.intecbrussel.classwerk11.inheritance;

public class Cow extends Animal {
    public Cow(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }


    public void eat(){
        System.out.println("Cow is eating");
    }
    public void sleep(){
        System.out.println("Cow is sleepeing");
    }
    public void soundAnimal(){
        System.out.println("Cow sounds like: Muu! Muu! Muu!");
    }

}
