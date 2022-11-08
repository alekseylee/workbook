package be.intecbrussel.icecreamshop.sellers;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumPrice;


    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumPrice = magnumPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice() {
        return magnumPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumPrice(double magnumPrice) {
        this.magnumPrice = magnumPrice;
    }
}
