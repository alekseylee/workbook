package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.Magnum;


public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type == Magnum.MagnumType.ALPINENUTS) {
            setMagnumStandardPrice(1.5*magnumStandardPrice);
        }
        return magnumStandardPrice;

    }
}

