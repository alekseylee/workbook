package be.intecbrussel.classwerk12;

public class Electric extends Car{

    public Electric(int speed, int battery, String color) {
        super(speed, battery, color);
    }

    public void charge(int battery){
        if (battery<=0){
            battery=100;
            System.out.println("Your battery is now fully charged");
        }
        else {
            System.out.println("Your battery is already fully charged");
        }
    }

    public void acceleration(int amount) {
        super.acceleration(amount);
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
