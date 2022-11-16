package be.intecbrussel.Lambda;

public class Customer {

    private int age;
    private String name;

    public Customer(int age) {
        this.age = age;
    }
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
