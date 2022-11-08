package be.intecbrussel.icecreamshop.eatables;

public class Cone implements Eatable{

    private Flavor[] balls;

    public Cone() {
    }
    public Cone(Flavor[]balls) {
        this.balls = balls;
    }
    Flavor[] balls() {
        return Flavor.values();
    }

    @Override
    public void eat() {
    }

}
