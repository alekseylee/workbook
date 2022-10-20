package be.intecbrussel.classwerk11.oefening2;

public class Student extends People {
    private String nameHuman = "Bart";

    public String getNamePeople() {
        return nameHuman;
    }

    public void setNamePeople(String namePeople) {
        this.nameHuman = namePeople;
    }

    public void peopleDo() {
        System.out.println(nameHuman + " is studing");
    }

}
