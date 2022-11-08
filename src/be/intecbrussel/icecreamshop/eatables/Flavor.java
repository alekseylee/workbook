package be.intecbrussel.icecreamshop.eatables;

public enum Flavor {
    STRAWBERRY,
    BANANA,
    CHOCOLATE,
    VANILLA,
    LEMON,
    STRACIATELLA,
    MOKKA,
    PISTACHE;

    private Flavor[] balls;

    Flavor(Flavor[] balls) {
        int x;
        for (x=0; x<balls.length; x++) {
            System.out.println(balls[x]);
        }
        this.balls = balls;
        }


    Flavor() {
    }


}