package be.intecbrussel.classwerk14.oefening2;

public class Car implements Motor, Switch {

    private boolean toggleSwitch;
    private int doors = 5;

    public Car() {
    }

    @Override
    public void gas() {
        System.out.println("Motor is on");
    }

    @Override
    public void toggleSwitch(boolean toggleSwitch) {
        if (toggleSwitch == true) {
            System.out.println("You can ride");
        } else {
            System.out.println("You need to toggle switch");
        }

    }

    void openDoor(int door) {
        if(door != 5) {
            System.out.println("You can't accelerate");
        } else if (door > 5) {
            System.out.println("You input invalid value");
        } else {
            System.out.println("You can start accelerate");
        }
    }
    void closeDoor(int door) {
        if (door==5) {
            System.out.println("You can start accelerate");
        } else {
            System.out.println("You should close all doors");
        }
    }
}
