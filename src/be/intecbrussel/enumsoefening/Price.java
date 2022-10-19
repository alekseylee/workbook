package be.intecbrussel.enumsoefening;

public enum Price {
    //     Constanten
    ACLASS(5000),
    BCLASS(20000),
    SUVCLASS(40000),
    SUPERCARCLASS(200000);


//     Field
    private int priceCode;
    // Constructor
    private Price(int priceCode) {
        this.priceCode = priceCode;
    }
    // Methodes
    int getPriceCode() {
        return priceCode;
    }
}