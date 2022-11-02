package be.intecbrussel.classwerk14.oefening3;

public class Laptop implements Battery{
    private int battery;
    public Laptop(int battery) {
        this.battery = battery;
    }

    @Override
    public int deliverPower() {
        return battery;
    }
}
