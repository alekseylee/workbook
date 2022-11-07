package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.Cone;
import be.intecbrussel.icecreamshop.eatables.IceRocket;
import be.intecbrussel.icecreamshop.eatables.Magnum;

public interface IceCreamSeller extends Profitable{
    Cone orderCone (Cone.Flavor[] balls );
    IceRocket orderIceRocket ();
    Magnum orderMagnum (Magnum.MagnumType type);
}

