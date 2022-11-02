package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class ElectroMotor implements Motor{


    @Override
    public void accelerate() {
        System.out.println(".... No sound, speeding up");
    }

    @Override
    public void deaccelerate() {
        System.out.println(".... No sound, slowing down");

    }
}
