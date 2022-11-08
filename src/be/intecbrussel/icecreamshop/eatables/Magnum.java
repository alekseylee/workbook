package be.intecbrussel.icecreamshop.eatables;

public class Magnum implements Eatable{

    private MagnumType type;


    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("You are eating Magnum with " +getType());

    }

}
