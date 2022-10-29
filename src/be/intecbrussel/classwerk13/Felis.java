package be.intecbrussel.classwerk13;

import java.util.Objects;

public class Felis extends Animal{

    private static int countAnimal;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;
    private int times;
    {if (isAlive())
        countAnimal++;}

    public Felis(){
    }

    public Felis(char size, char coat, String color, double weight, String name, int age, int badgeNo, int shelterNo) {
        super(size, coat, color, weight);
        this.name = name;
        this.age = age;
        this.badgeNo = badgeNo;
        this.shelterNo = shelterNo;
    }

    public void miauw (int times) {
        int i;
        for(i=0; i < times; i++) {
            System.out.println(i+ " Miauw");
        }
    }

    public  static int getVaccinatedCats(){
        return countAnimal;
    }
    public void setShelterNo(int shelterNo) {
        if (shelterNo>999 || shelterNo<0){
            System.out.println("Not possible");
            System.exit(-1);
        }
        else
            this.shelterNo = shelterNo;
    }


    public void setBadgeNo(int badgeNo) {
        if (badgeNo>999 || badgeNo<0){
            System.out.println("Not possible");
            System.exit(-1);
        }
        else
            this.badgeNo = badgeNo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                ", times=" + times +
                '}'+super.toString();
    }
}
