package be.intecbrussel.classwerk13;

public class TurkishVanCat extends Felis{
    public TurkishVanCat(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight, name, age, badgeNo, shelterNo);
    }
      public String nickname;

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                "nickname='" + nickname + '\'' +
                '}'
                +super.toString();
    }
}
