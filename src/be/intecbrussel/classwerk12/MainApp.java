package be.intecbrussel.classwerk12;

public class MainApp {
    public static void main(String[] args) {

        Car suv = new Suv("red", 250, 0);
        Car cabrio = new Cabrio("yellow", 200, 0);
        Car electric = new Electric("green", 0, 0, 60);
        electric.setSpeed(50);
        System.out.println(electric.getSpeed());
        electric.setSpeed(60);
        electric.acceleration();
        electric.acceleration();
        System.out.println(electric.getSpeed());

        electric.acceleration();
        electric.acceleration();
        System.out.println(electric.getSpeed());
        System.out.println();
        System.out.println();

//        cabrio.setSpeed(50);
//        cabrio.slowDown();
//        cabrio.slowDown();
//        cabrio.slowDown();
//        System.out.println(cabrio.getSpeed());
//        System.out.println(cabrio.getSpeed());
//        cabrio.acceleration();
//        cabrio.acceleration();
//        cabrio.acceleration();
//        cabrio.acceleration();
//        System.out.println(cabrio.getSpeed());

//
//        suv.setSpeed(50);
//        System.out.println(suv.getSpeed());
//        suv.acceleration();
//        System.out.println(suv.getSpeed());





    }
}

//public static info()
