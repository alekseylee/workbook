package be.intecbrussel.LambdaTest2;

public class Student extends Person{
    private static int incrementId;

    public Student() {
        super();
    }

    public Student(String name, String lastName) {
        super(name, lastName);

    }

    public int getIncrementId() {
        return incrementId++;

    }

    public int id = 1;

}
