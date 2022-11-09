package be.intecbrussel.icecreamshop.application;


import be.intecbrussel.icecreamshop.eatables.Cone;
import be.intecbrussel.icecreamshop.eatables.Magnum;
import be.intecbrussel.icecreamshop.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList= new PriceList();
        Stock stock01 = new Stock();
        IceCreamSeller iceCreamCar= new IceCreamCar(priceList,stock01);


        stock01.setCones(2);
        stock01.setIceRockets(3);
        stock01.setMagni(1);

        iceCreamCar.orderIceRocket().eat();
        iceCreamCar.orderIceRocket().eat();
        iceCreamCar.orderIceRocket().eat();
        //iceCreamCar.orderIceRocket().eat();

        iceCreamCar.orderMagnum(Magnum.MagnumType.BLAСKCHOCOLATE).eat();
        //iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();

        iceCreamCar.orderCone(Cone.Flavor.values()).eat();
        iceCreamCar.orderCone(Cone.Flavor.values()).eat();
        // iceCreamCar.orderCone(Cone.Flavor.values()).eat();





    }

}
