package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class KeySwitch implements Switch{


    @Override
    public void turnOn() {
        System.out.println("You put in key turn on and drive");
    }

    @Override
    public void turnOff() {
        System.out.println("You takeoff key and don't forget close car");

    }
}
