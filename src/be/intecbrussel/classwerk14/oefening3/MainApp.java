package be.intecbrussel.classwerk14.oefening3;

public class MainApp {
    public static void main(String[] args) {
        Laptop laptop01 = new Laptop(50);
        Phone phone01 = new Phone(78);
//
//        outputInfo(laptop01);
//        outputInfo(phone01);

        Battery duracelAA = new DuracelAA();
        Battery duracelAAA = new DuracelAAA();
        Battery vartaAA = new VartaAA();

        Flashlight flashlight01 = new Flashlight(duracelAAA);
        Flashlight flashlight02 = new Flashlight(new VartaAA());

    }
    public static void outputInfo(Battery battery) {
        System.out.println(battery.deliverPower());
    }

}
