package be.intecbrussel.classwerk12;

public class Car {
    private String color;
    private int speed;
    private int hp;
    private int battery;

    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
        this.battery = -1;
    }

    public Car(int speed, int battery, String color) {
        this.color = color;
        this.speed = speed;
        this.battery = battery;
    }


    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed(){
        return speed;
    }

    public int getHp() {
        return hp;
    }

    //methods
    public void acceleration (int amount){
        if (battery == -1) {
            speed += (amount + (hp / 100));
        } else {
            speed+= (amount+(battery/100));
        }
        System.out.println("The car speeds up to " + speed);
    }

    public void slowDown (int amount){

        if (speed > 0) {
            speed-=(amount-(hp / 100));
            System.out.println("The car slows down and now drives " + (speed-=amount - (hp / 100)));
        }
        else {
            System.out.println("The car already stands still and can't slow down further");
        }
    }

    public void park (){

        speed=0;
        System.out.println("You park the car. The car now stands still");

    }

    @Override
    public String toString() {
        if (battery < 0) {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", speed=" + speed +
                    ", hp=" + hp +
                    '}';
        } else {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", speed=" + speed +
                    ", battery=" + battery +
                    '}';
        }
    }
}

