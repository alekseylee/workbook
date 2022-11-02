package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class KeySwitch extends Car implements Switch{

    public KeySwitch(Switch onOffSwitch, Motor motor, Horn horn) {
        super(onOffSwitch, motor, horn);
    }

    @Override
    public void turnOn() {
        System.out.println("You put in key turn on and drive");
    }

    @Override
    public void turnOff() {
        System.out.println("You takeoff key and don't forget close car");

    }
}
