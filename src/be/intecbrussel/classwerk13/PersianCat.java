package be.intecbrussel.classwerk13;

public class PersianCat extends Felis{

    public PersianCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
    }

    @Override
    public void miauw() {
        System.out.println("Permyau!");
    }

    @Override
    public String toString() {
        return "PersianCat{} "
                +super.toString();
    }
}
