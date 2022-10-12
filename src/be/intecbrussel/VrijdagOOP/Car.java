package be.intecbrussel.VrijdagOOP;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Car {
    //properties
    private int horsePower;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private int speedUp;
    private int speedDown;
    private int repair;
    private static int counter = 0;
    private boolean lights;
    private String driver;
    private String licensePlate;
    Scanner scan;
    Random random;


    //constructor
    public Car () {
        color = "white";
        maxSpeed = 120;
        horsePower = 150;
        currentSpeed = 0;
        counter++;
        this.lights = false;
        this.scan = new Scanner(System.in);
        this.random = new Random();
        this.driver = "unkown";
    }

    public Car (String color, int maxSpeed) {
        horsePower = 150;
        counter++;
        this.lights = false;
        this.scan = new Scanner(System.in);
        this.random = new Random();
        this.driver = "unkown";

    }

    public Car(String color, int maxSpeed, int hoursePower) {
        counter++;
        this.lights = false;
        this.scan = new Scanner(System.in);
        this.random = new Random();
        this.driver = "unkown";
    }

    //getters setters

    public static int getCounter() {
        return counter;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // lights
    public boolean isLights() {
        return this.lights;
    }
    public void setLights(boolean lights) {
        this.lights = lights;
    }
    public void toggleLights() {
        if (this.lights) {
            this.setLights(false);
            System.out.println("The lights are off");
        } else {
            this.setLights(true);
            System.out.println("The lights are on");
        }
    }

    //driver
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void assignDriver() {
        System.out.println("Please enter the name of the drive");

        while(true) {
            this.setDriver(this.scan.nextLine());
            if (!this.driver.trim().isBlank() && this.driver.length() >= 5) {
                System.out.println("The driver's name is " + this.driver);
                return;
            }
            System.out.println("Not allowed");
            System.out.println("Please re-enter the name of the driver");
        }
    }

    //license plate
    public String getLicensePlate() {
        return this.licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void generateLicensePlate() {
        String plate = this.driver.toUpperCase(Locale.ROOT).substring(0, 3);
        this.setLicensePlate(plate + "-" + (this.random.nextInt(900) + 100));
        System.out.println(this.licensePlate);
    }

    // if properties for max and current speed
    public int getCurrentSpeed() {
        if(currentSpeed > maxSpeed) {
            System.out.println("Your driving is not correct, change your speed, please.");
        } else if (currentSpeed < 0) {
            System.out.println("Your driving is not correct, change your speed, please.");
        } else {
            return currentSpeed;
        }
        return 10;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    //speed up & down
    public void speedUp () {
        currentSpeed += 5;
    }


    public void speedDown () {
        currentSpeed -= 5;
    }

    //paint car
    public void setPaint(String paint) {
        this.color = paint;
    }
    //random
    public int getRepair() {
        return (int) (100 + Math.random()*200);
    }


    public String toString() {
        return "Car{, colour='" + this.color + "', maxSpeed=" + this.maxSpeed + ", horsePower=" + this.horsePower + ", currentSpeed=" + this.currentSpeed + ", repairCost=" + this.repair + "}";
    }
}


