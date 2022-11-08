package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.*;

public class IceCreamSalon implements IceCreamSeller{

    @Override
    public Cone orderCone(Flavor[] balls) {
        return new Cone(balls);
    }

    @Override
    public Magnum orderMagnum() {
        return new Magnum();
    }


    @Override
    public IceRocket orderIceRocket() {
        return new IceRocket();
    }

    @Override
    public void getProfit(double profit) {

    }
}
