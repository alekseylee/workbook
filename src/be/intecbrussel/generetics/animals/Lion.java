package be.intecbrussel.generetics.animals;

import java.util.Comparator;

public class Lion implements Comparable <Lion> {
    private String name;
    private double neckForLength;
    private int age;

    public Lion(String name, double neckForLength, int age) {
        this.name = name;
        this.neckForLength = neckForLength;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getNeckForLength() {
        return neckForLength;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", neckForLength=" + neckForLength +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Lion o) {
        Lion lion1 = this;
        Lion lion2 = o;

        int lion1Age = lion1.age;
        int lion2Age = lion1.age;

        if (lion1Age > lion2Age) {
            return 1;
        } else if (lion1Age == lion2Age) {
            return 0;
        } else {
            return -1;
        }

//        int returnValue = this.name.compareTo(o.name);
//        return returnValue;
     }
}
