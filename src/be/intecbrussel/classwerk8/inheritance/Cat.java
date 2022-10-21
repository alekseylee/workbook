package be.intecbrussel.classwerk8.inheritance;

public class Cat extends Animal{


    public Cat(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
    public void catEat(){
        super.sleep();
    }
    public void sleep(){
        System.out.println("Cat is sleepeing");
    }
    public void catSleep(){
        super.sleep();
    }
    public void soundAnimal(){
        super.soundAnimal();
        System.out.println("Cat sounds like: Meow! Meow Meow");
    }
//    public void sayCat() {
//        super.soundAnimal();
//    }


}
