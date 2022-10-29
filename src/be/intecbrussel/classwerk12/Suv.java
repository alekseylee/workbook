package be.intecbrussel.classwerk12;

public class Suv extends Car{

    private boolean bullbar;
    private boolean mode4x4Driving = false;

    public Suv(String color, int speed, int hp, boolean bullbar) {
        super(color, speed, hp);
        this.bullbar = bullbar;
    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void driving4x4 (boolean mode4x4Driving) {
        this.mode4x4Driving = mode4x4Driving;
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

    @Override
    public void acceleration(int amount) {
        if(mode4x4Driving == false) {
            super.acceleration(amount);
        }
        else if (mode4x4Driving == true && getSpeed() < 30) {
            super.acceleration(amount);
        } else {
            System.out.println("Car can ride in 4x4 mode only when your speed not more 30");
        }


    }
}
