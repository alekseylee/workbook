package be.intecbrussel.classwerk14.oefening3;

public class MainApp {
    public static void main(String[] args) {
        Laptop laptop01 = new Laptop(50);
        Phone phone01 = new Phone(78);

        laptop01.deliverPower();
//        outputInfo(laptop01);
//        outputInfo(phone01);

    }
    public static void outputInfo(Battery battery) {
        battery.deliverPower();
    }
}
