package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.*;

public interface IceCreamSeller extends Profitable{


    @Override
    default void getProfit(double profit) {
    }


    Cone orderCone(Flavor[] balls);
    Magnum orderMagnum();
    IceRocket orderIceRocket();


}
