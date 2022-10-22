package be.intecbrussel.classwerk11.interitance3;

public class Worker extends Person {

    public Worker(String namePerson, String nameCity, String nameProfession, int agePerson) {
        super(namePerson, nameCity, nameProfession, agePerson);
    }
    public void nameCity(){
        System.out.println("Brussel");
    }
}
