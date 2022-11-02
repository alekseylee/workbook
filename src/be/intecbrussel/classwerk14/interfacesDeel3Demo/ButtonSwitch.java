package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class ButtonSwitch implements Switch{


    @Override
    public void turnOn() {
        System.out.println("You push button on and you can drive");
    }

    @Override
    public void turnOff() {
        System.out.println("You push button off and don't forget close car");

    }
}
