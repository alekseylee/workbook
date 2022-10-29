package be.intecbrussel.classwerk13;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
        animalCount++;
    }

    public void  miauwInNorvegian(int times) {
        int i;
        for(i=0; i < times; i++) {
            System.out.println(i+ " Norwegian Forest cat sounds like - normuaaaauuuu....");
        }
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{} "
                +super.toString();
    }
}
