package be.intecbrussel.classwerk13;

public class Cheetah extends Animal{

    private double speed;

    public Cheetah(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public void run(double distance) {
        System.out.println("Chetaah runs " + distance + " km");

    }

    public void kiauuww() {
        System.out.println("Kiauww!");
    }

    @Override
    public String toString() {
        return "Cheetah{" +
                "speed=" + speed +
                '}'+super.toString();
    }
}

