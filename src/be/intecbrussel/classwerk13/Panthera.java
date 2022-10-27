package be.intecbrussel.classwerk13;

public class Panthera extends Animal{

    public Panthera(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public String roar() {
        return "Rooooaaarr!";
    }

    public void hunt () {
        System.out.println("Panthera is hunting");
    }

    @Override
    public String toString() {
        return "Panthera{} " +super.toString();
    }
}

