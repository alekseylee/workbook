package be.intecbrussel.classwerk8.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Animal cat = new Animal("Kitty", 10);
        Animal dog = new Animal("Buddy", 15);
        System.out.println("Name of this animal is: " + cat.nameAnimal);
        System.out.println("Age of this animal is: " + cat.ageAnimal);
        System.out.println("Name of this animal is: "+ dog.nameAnimal);
        System.out.println("Age of this animal is: " + dog.ageAnimal);
        cat.eat();
        cat.sleep();
        cat.soundAnimal();
    }
}
