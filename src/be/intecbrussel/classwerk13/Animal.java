package be.intecbrussel.classwerk13;

public class Animal {

    private char size;
    private char coat;
    private String color;
    private double weight;
    private boolean alive;
    protected static int animalCount=0;

    {animalCount++;}
    public Animal() {
    }

    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    public void makeNoise(){
        System.out.println("Sound of animal");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public boolean isAlive(){
        System.out.println("This cat is alive: ");
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight;
    }
}
