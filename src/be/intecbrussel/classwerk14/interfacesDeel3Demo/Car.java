package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class Car {

    private Switch onOffSwitch;
    private Motor motor;
    private Horn horn;

    public Car(Switch onOffSwitch, Motor motor, Horn horn) {
        this.onOffSwitch = onOffSwitch;
        this.motor = motor;
        this.horn = horn;
    }

    public Switch getOnOffSwitch() {
        return onOffSwitch;
    }

    public Motor getMotor() {
        return motor;
    }

    public Horn getHorn() {
        return horn;
    }
}
