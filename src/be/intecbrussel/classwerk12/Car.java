package be.intecbrussel.classwerk12;

public abstract class Car {
    private String color;
    protected int speed;
    private int hp;

    public Car() {
    }
    public Car(String color, int hp, int speed) {
        this.color = color;
        this.hp = hp;
        this.speed = speed;
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

    public void slowDown() {
        this.speed = speed - (hp/100);
    }

    public void parking (int speed) {
        if (getSpeed() == 0) {
            this.speed = getSpeed();
            System.out.println("Car is parked");
        } else {
            System.out.println("You can park when your speed is 0");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}

