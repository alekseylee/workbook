package be.intecbrussel.VrijdagOOP;

public class MainApp {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        // set the values of the machines
        car1.setColor("purple");
        System.out.println("\nCar1 is " + car1.getColor());
        System.out.println("Car1 has " + car1.getMaxSpeed() + " max speed");
        System.out.println("Car1 has " + car1.getHorsePower() + " HP");
        car2.setColor("green");
        car2.setMaxSpeed(70);
        System.out.println("\nCar2 is " + car2.getColor());
        System.out.println("Car2 has " + car2.getMaxSpeed() + " max speed");
        System.out.println("Car2 has " + car2.getHorsePower() + " HP");
        car3.setColor("yellow");
        car3.setMaxSpeed(160);
        car3.setHorsePower(200);
        System.out.println("\nCar3 is " + car3.getColor());
        System.out.println("Car3 has " + car3.getMaxSpeed() + " max speed");
        System.out.println("Car3 has " + car3.getHorsePower() + " HP");
        // speed up and speed down
        car2.setCurrentSpeed(10);
        car2.setMaxSpeed(70);
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedUp();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedUp();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedUp();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedUp();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedUp();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedDown();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedDown();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        car2.speedDown();
        System.out.println("\nCar2 current speed is: " + car2.getCurrentSpeed());
        // paint car
        car2.setPaint("black");
        // repair
        System.out.println("\nRepair cost is "+ car2.getRepair());
        //counter
        System.out.println(Car.getCounter());
        //lights
        car3.toggleLights();

        //Driver
        car2.assignDriver();

        //plate
        car2.generateLicensePlate();
    }
}
