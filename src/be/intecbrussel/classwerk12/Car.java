package be.intecbrussel.classwerk12;

public class Car {
    private String color;
    protected int speed;
    private int hp;





    public Car() {
        this.color = color;
        this.hp = hp;
    }
    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }
    public void speed (int speed) {
        this.speed = speed;
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

    public void acceleration() {
        this.speed = speed + (hp / 100);
    }

    public void slowDown(int speed) {
        this.slowDown(speed - (hp/100));
    }

    public void parking (int speed) {
        if (getSpeed() == 0) {
            this.speed = getSpeed();
            System.out.println("Car is parked");
        } else {
            System.out.println("You driving");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}

