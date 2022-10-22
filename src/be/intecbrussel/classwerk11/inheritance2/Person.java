package be.intecbrussel.classwerk11.inheritance2;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public void eat() {
        System.out.println(name + " is " + profession + " and now eating");
    }
    public void sleep() {
        System.out.println(name + " is " + profession + " and now sleeping");
    }
    public void work(){
        System.out.println(name + " is " + profession + " and now working");
    }
}
