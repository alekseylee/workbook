package be.intecbrussel.classwerk12;

public class Suv extends Car{

    private boolean bullbar;

    public Suv(String color, int hp, int speed) {
        super(color, hp, speed);
    }


    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void driving4x4 (boolean bullbar) {
        while (true) {
            System.out.println("You drive ");
//            for ()
        }
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
