package be.intecbrussel.classwerk14.oefeningINclass;

public class Car implements Motor,Switch,Horn{
    @Override
    public void makeSound() {
        System.out.println("honk honk");
        //Horn.super.makeSound();
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
        System.out.println("ONN");
    }

    @Override
    public void turnOff() {
        System.out.println("OFF");
    }

}
