package be.intecbrussel.classwerk8.inheritance;

public class Dog extends Animal {

    public Dog(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }


    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleepeing");
    }

    public void soundAnimal(){
        System.out.println("Animal sounds like: BARK! BARK! BARK!");
    }
    public void sayDog(){
        super.soundAnimal();
    }

}
