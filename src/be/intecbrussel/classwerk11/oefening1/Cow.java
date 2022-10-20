package be.intecbrussel.classwerk11.oefening1;

public class Cow extends Animal {
    private String nameAnimal;
    private int ageAnimal;

    public Cow (String nameAnimal, int ageAnimal) {
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
        this.ageAnimal = ageAnimal;
    }

    public void animalSound() {
        System.out.println("This animal sound is - Mouuu Mouuu");
    }
}
