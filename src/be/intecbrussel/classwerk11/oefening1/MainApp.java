package be.intecbrussel.classwerk11.oefening1;

public class MainApp {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Animal animal01 = new Cat("Garry", 4);
        Animal animal02 = new Dog("Rocky", 7);
        Animal animal03 = new Cow("Donny", 10);


        animal.animalSound();
        animal01.animalSound();
        animal02.animalSound();
        animal03.animalSound();

    }
}
