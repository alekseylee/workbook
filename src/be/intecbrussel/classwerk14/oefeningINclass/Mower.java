package be.intecbrussel.classwerk14.oefeningINclass;

public class Mower implements LawnMower{
    @Override
    public void adjustHeight(int height) {
        System.out.println("Height to: " + height+ "mm");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate");

    }

    @Override
    public void decelerate() {
        System.out.println("Decelerate");

    }

    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");

    }
}
