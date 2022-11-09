package be.intecbrussel.icecreamshop.sellers;

import be.intecbrussel.icecreamshop.eatables.Cone;
import be.intecbrussel.icecreamshop.eatables.IceRocket;
import be.intecbrussel.icecreamshop.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone= prepareCone(flavors);
        if (flavors != null && flavors.length > 0) {
            profit += priceList.getBallPrice() * flavors.length;
        } else {
            profit += priceList.getBallPrice();
        }
        return new Cone(flavors);
    }
    private Cone prepareCone(Cone.Flavor[] flavors) {
        if(/* niet genoeg magnums */stock.getCones()==0){
            throw new NoMoreIceCreamException();
        }
        stock.setCones(stock.getCones()-1);
        return new Cone();
    };



    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket=prepareIceRocket();
        profit+=priceList.getRocketPrice();
        return new IceRocket();
    }
    private IceRocket prepareIceRocket() {
        if(/* niet genoeg magnums */stock.getIceRockets()==0){
            throw new NoMoreIceCreamException();
        }
        stock.setIceRockets(stock.getIceRockets() - 1);
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnum = prepareMagnum(type);
        profit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }
    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException{
        if(/* niet genoeg magnums */stock.getMagni()==0){
            throw new NoMoreIceCreamException();
        }
        stock.setMagni(stock.getMagni() -1);
        return new Magnum();
    }

    @Override
    public double getProfit() {
        return profit;
    }


}
