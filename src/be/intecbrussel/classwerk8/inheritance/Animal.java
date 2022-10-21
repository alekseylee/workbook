package be.intecbrussel.classwerk8.inheritance;

public class Animal {
    String nameAnimal;
    public int ageAnimal;

    public Animal(String nameAnimal, int ageAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void soundAnimal(){
        System.out.println("Sound of animal");
    }


}
