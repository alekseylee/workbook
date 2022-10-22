package be.intecbrussel.classwerk11.inheritance;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1);
        Cat cat1 = new Cat("Kitty", 10);
        Dog dog1 = new Dog("Buddy", 15);
        Cow cow1 = new Cow("Milky", 20);

        info(cat1);
        info(dog1);
        info(cow1);

    }

    public static void info(Animal animal){
        System.out.println("Animal name: " + animal.getNameAnimal());
        System.out.println("Animal age: " + animal.getAgeAnimal());
        animal.eat();
        animal.sleep();
        animal.soundAnimal();
        System.out.println();
    }
}
