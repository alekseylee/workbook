package be.intecbrussel.classwerk11.inheritance;

public class Animal {
    private String nameAnimal;
    private int ageAnimal;



    public Animal(String nameAnimal, int ageAnimal) {
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
