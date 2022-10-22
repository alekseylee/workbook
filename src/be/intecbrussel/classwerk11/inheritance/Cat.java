package be.intecbrussel.classwerk11.inheritance;

public class Cat extends Animal {

    public Cat(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }



    public void eat(){
        System.out.println("Cat is eating");
    }

    public void sleep(){
        System.out.println("Cat is sleepeing");
    }

    public void soundAnimal(){
        System.out.println("Cat sounds like: Meow! Meow Meow");
    }
}
