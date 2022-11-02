package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public class MainApp {
    public static void main(String[] args) {

        Horn bigHorn = new BigHorn();
        Horn smallHorn = new SmallHorn();

        Switch keySwitch = new KeySwitch();
        Switch buttonSwitch = new ButtonSwitch();

        Motor petrolMotor = new PetrolMotor();
        Motor electromotor = new ElectroMotor();

        Car oldCar = new Car (keySwitch, petrolMotor, smallHorn);
        Car electricCar = new Car(buttonSwitch, electromotor, bigHorn);
        oldCar.getOnOffSwitch().turnOn();
        electricCar.getOnOffSwitch().turnOn();

        Car car3 = new Car(new ButtonSwitch(), new PetrolMotor(), new BigHorn());
        car3.getHorn().makeSound();


//        Car car01 = new Car("", "", "");


    }
}
