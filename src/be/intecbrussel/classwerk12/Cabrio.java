package be.intecbrussel.classwerk12;

public class Cabrio extends Car {
    private boolean sunroof;
    private boolean sunroofOpen;

    public Cabrio(String color, int speed, int hp, boolean sunroof) {
        super(color, speed, hp);
        this.sunroof = sunroof;
    }

    public boolean isSunroofOpen() {
        return sunroofOpen;
    }

    public boolean isSunroof() {
        if(true) {
            return sunroof=true;
        } else {
        } return this.sunroof;
    }

    public void setSunroofOpen(boolean sunroofOpen) {
        this.sunroofOpen = sunroofOpen;
    }
    public void openRoof() {
        if (sunroof=false) {
            setSunroofOpen(true);
            System.out.println("The sunroof is open");
        } else {
            setSunroofOpen(false);
            System.out.println("The roof is close");
        }
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
    @Override
    public void slowDown(int amount) {
        super.slowDown(amount);
    }

    @Override
    public void park() {
        super.park();
    }
}




