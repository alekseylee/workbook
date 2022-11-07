package be.intecbrussel.icecreamshop.eatables;

public class Magnum implements Eatable{
   private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
    }

    public MagnumType getType() {
        return type;
    }

    public enum MagnumType{
      MILKCHOCOLATE,
      WHITECHOCOLATE,
      BLANKCHOCOLATE,
      ALPINENUTS,
      ROMAINTICSTRAWBERRIES;
    }
}
