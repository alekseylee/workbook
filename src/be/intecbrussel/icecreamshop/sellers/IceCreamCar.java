package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.Cone;
import be.intecbrussel.icecreamshop.eatables.IceRocket;
import be.intecbrussel.icecreamshop.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;


    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }
    public IceRocket prepareRocket (){
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }
    public Magnum prepareMagnum(Magnum.MagnumType type) {
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
