package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class PetrolMotor implements Motor{


    @Override
    public void accelerate() {
        System.out.println("You listen your motor when you drive");

    }

    @Override
    public void deaccelerate() {
        System.out.println("You listen less your motor when you drive");

    }
}
