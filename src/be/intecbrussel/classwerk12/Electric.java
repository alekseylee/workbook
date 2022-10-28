package be.intecbrussel.classwerk12;

public class Electric extends Car{
    private int battery;

    public Electric(String color, int hp, int speed, int battery) {
        super(color, hp, speed);
        this.battery=battery;
    }

    @Override
    public void acceleration() {
        this.speed = speed+ (battery/100);
    }

    public void slowDown() {
        this.speed= speed - (battery/100);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
