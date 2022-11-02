package be.intecbrussel.classwerk14.oefening3;

public class Phone implements Battery{
    private int battery;

    public Phone(int battery) {
        this.battery = battery;
    }

    @Override
    public int deliverPower() {
        return battery;
    }
}
