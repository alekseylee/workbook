package be.intecbrussel.icecreamshop.eatables;

public class Cone implements Eatable{
   private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println(Flavor.values());

    }

   public enum Flavor{
        STRAWBERRY,
        BANANA,
        CHOKOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

    }
}
