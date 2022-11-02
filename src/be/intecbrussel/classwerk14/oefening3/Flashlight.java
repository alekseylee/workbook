package be.intecbrussel.classwerk14.oefening3;

public class Flashlight {

   private Battery battery;

    public Flashlight(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Flashlight{" +
                "battery=" + battery +
                '}';
    }

    public void setBattery(Battery battery) {
        this.battery = battery;


    }
}



