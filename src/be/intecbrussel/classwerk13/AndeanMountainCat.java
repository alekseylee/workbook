package be.intecbrussel.classwerk13;

public class AndeanMountainCat extends Felis{
    public AndeanMountainCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public boolean isAlive() {
       return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{}"+super.toString();
    }
}
