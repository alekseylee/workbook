package be.intecbrussel.classwerk11.oefening2;

public class Worker extends People {
    private String nameHuman = "Maria";

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public void peopleDo() {
        System.out.println(nameHuman + " is working");
    }

}
