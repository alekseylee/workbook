package be.intecbrussel.classwerk12;

public class MainApp {
    public static void main(String[] args) {
        //String color, int speed, int hp
        //public Car(int speed, int battery, String color)
        Car suv = new Suv("red", 0, 250, true);
        Car cabrio = new Cabrio("yellow", 0, 200, true);
        Car electric = new Electric(0, 60, "green");

        suv.acceleration(50);
        cabrio.acceleration(50);
        electric.acceleration(50);

        System.out.println(suv);
        System.out.println(cabrio);
        System.out.println(electric);

        Car[] cars = {suv, cabrio, electric};

        for (Car allcars: cars) {
            System.out.println(allcars);
        }

    }
}


