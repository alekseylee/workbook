package be.intecbrussel.icecreamshop.application;

import be.intecbrussel.icecreamshop.eatables.Magnum;
import be.intecbrussel.icecreamshop.sellers.IceCreamSalon;
import be.intecbrussel.icecreamshop.sellers.IceCreamSeller;
import be.intecbrussel.icecreamshop.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();
        IceCreamSeller iceCreamSalon = new IceCreamSalon();

        iceCreamSalon.orderIceRocket();
//        iceCreamSalon.orderCone( );
        iceCreamSalon.orderMagnum(Magnum.MagnumType.valueOf("MILKCHOCOLATE"));



    }
}
