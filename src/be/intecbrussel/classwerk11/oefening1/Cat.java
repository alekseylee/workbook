package be.intecbrussel.classwerk11.oefening1;

public class Cat extends Animal {
private String nameAnimal;
private int ageAnimal;

public Cat (String nameAnimal, int ageAnimal) {

    this.nameAnimal = nameAnimal;
    this.ageAnimal = ageAnimal;
}

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        System.out.println(ageAnimal);
        this.ageAnimal = ageAnimal;
    }

    public void animalSound() {
        System.out.println("This animal sound is - Meow Moew");
    }
}
