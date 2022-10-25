package be.intecbrussel.classwerk12;

public class Cabrio extends Car {
    private boolean sunroof;

    public Cabrio(String color, int hp) {
        super(color, hp);
    }

    public boolean isSunroof() {
        return this.sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void openRoof() {
        if (this.sunroof) {
            this.setSunroof(false);
            System.out.println("The roof is close");
        } else {
            this.setSunroof(true);
            System.out.println("The roof is open");
        }



    }
}


