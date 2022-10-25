package be.intecbrussel.classwerk12;

public class MainApp {
    public static void main(String[] args) {

        Car suv = new Suv("red", 250);
        Car cabrio = new Cabrio("yellow", 200);
        Car electric = new Electric("green", 60);
        electric.setSpeed(50);
        System.out.println(electric.getSpeed());
        electric.parking(electric.getSpeed());
        electric.acceleration();
        electric.acceleration();
        System.out.println();
        System.out.println();
        System.out.println(electric.getSpeed());
        System.out.println();

        cabrio.setSpeed(50);
        System.out.println(cabrio.getSpeed());
        cabrio.acceleration();
        System.out.println(cabrio.getSpeed());

        suv.setSpeed(50);
        System.out.println(suv.getSpeed());
        suv.acceleration();





    }
}

//public static info()
