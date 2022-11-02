package be.intecbrussel.classwerk14.oefeningINclass;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.makeSound();
        car1.turnOn();
        car1.turnOff();
        car1.accelerate();
        System.out.println("-------------");

        Mower mower = new Mower();
        mower.turnOn();
        mower.turnOff();
        mower.accelerate();
        mower.decelerate();
        mower.adjustHeight(10);
    }
}
