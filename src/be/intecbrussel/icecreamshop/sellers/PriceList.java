package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.enumsoefening.Price;
import be.intecbrussel.icecreamshop.eatables.Magnum;
import be.intecbrussel.icecreamshop.eatables.MagnumType;

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
        if (MagnumType.ALPINENUTS.name() == "ALPINENNUTS") {
            return magnumPrice * 1.5;
        }
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
