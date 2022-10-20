package be.intecbrussel.classwerk10;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Brand name " + car.getBrandName() + " Type of vehicle" + car.getTypeOfVehicle());
        car.honk();


    }
}
