package be.intecbrussel.classwerk13;

public class SiameseCat extends Felis{
    public SiameseCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
    }

    @Override
    public void miauw(int times) {
        int i;
        for(i=0; i < times; i++) {
            System.out.println(i+ " Siamese cat sounds like - simyaaauuu...");
        }
    }

    @Override
    public String toString() {
        return "SiameseCat{} "
                +super.toString();
    }
}
