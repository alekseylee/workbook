package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    private PriceList pricelist;
    private Stock stock;
    private double profit;

    @Override
    public Cone orderCone(Flavor[] balls) {
        if (balls!=null && balls.length>0){
            profit = pricelist.getBallPrice() * balls.length;
        }
        else {
            profit+= pricelist.getBallPrice();
        }
        return new Cone(balls);

    }
    public Cone prepareCone(Flavor[] balls) {
        return null;
    }



    @Override
    public Magnum orderMagnum() {
        return new Magnum();
    }
    Magnum prepareMagnum() {
        return orderMagnum();
    }

    @Override
    public IceRocket orderIceRocket() {
        return new IceRocket();
    }

    @Override
    public void getProfit(double price) {

    }




}
