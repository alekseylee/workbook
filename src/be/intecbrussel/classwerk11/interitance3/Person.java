package be.intecbrussel.classwerk11.interitance3;

public class Person {
    private String namePerson;
    private String nameCity;
    private String nameProfession;
    private int agePerson;


    public Person(String namePerson, String nameCity, String nameProfession, int agePerson) {
        this.namePerson = namePerson;
        this.nameCity = nameCity;
        this.nameProfession = nameProfession;
        this.agePerson = agePerson;
    }

    public String toString() {
        return namePerson + " " + agePerson + " " + nameCity + " " + nameProfession;
    }
}



