package be.intecbrussel.classwerk13;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
    }

    public void  miauwInNorvegian() {
        System.out.println("Normuau");
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{} "
                +super.toString();
    }
}
