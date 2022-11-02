package be.intecbrussel.classwerk14.oefening2;

public class MainApp {
    public static void main(String[] args) {

        Car car01 = new Car();
        car01.gas();
        car01.toggleSwitch(false);

        car01.closeDoor(2);
        car01.openDoor(1);

    }
}
