package be.intecbrussel.icecreamshop.sellers;


import be.intecbrussel.icecreamshop.eatables.Cone;
import be.intecbrussel.icecreamshop.eatables.IceRocket;
import be.intecbrussel.icecreamshop.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList pricelist;
    private double totalProfit;
    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        return new Cone() ;

    }

    @Override
    public IceRocket orderIceRocket() {
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return new Magnum();
    }

    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "pricelist=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
