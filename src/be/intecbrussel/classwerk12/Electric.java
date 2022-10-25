package be.intecbrussel.classwerk12;

public class Electric extends Car{
    private int battery;

    public Electric(String color, int battery) {
        super(color, battery);
    }


    public void acceleration() {
        this.speed = speed + (battery / 100);
    }
    public void slowDown(int speed) {
        this.slowDown(speed - (battery/100));
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
