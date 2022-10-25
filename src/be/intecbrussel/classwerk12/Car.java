package be.intecbrussel.classwerk12;

public class Car {
    private String color;
    private int speed;
    private int hp;





    public Car() {
        this.color = color;
        this.hp = hp;
    }
    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    public void acceleration(int speed) {
        this.acceleration(speed + (hp/100));
    }
    public void slowDown(int speed) {
        this.slowDown(speed - (hp/100));
    }

    public void parking (int speed) {
        this.speed=0;
            System.out.println("Car is parked");
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

