package be.intecbrussel.classwerk12;

public class Cabrio extends Car {
    private boolean sunroof;

    public Cabrio(String color, int hp, int speed) {
        super(color, hp, speed);
    }

    public boolean isSunroof() {
        if(true) {
            return sunroof=true;
        } else {
        } return this.sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
    public void openRoof() {
        if (sunroof=false) {
            this.setSunroof(false);
            System.out.println("The roof is close");
        } else {
            this.setSunroof(true);
            System.out.println("The roof is open");
        }
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }


}




