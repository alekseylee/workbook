package be.intecbrussel.generetics.animals;

import be.intecbrussel.LambdaTest.Book;

import java.util.Arrays;
import java.util.Comparator;

public class LionApp {
    public static void main(String[] args) {

        Lion lion1 = new Lion("Jean-Roar", 20, 10);
        Lion lion2 = new Lion("Jean-Bite", 12.50, 99);
        Lion lion3 = new Lion("Jean-Jean", 1, 2);
        Lion lion4 = new Lion("Jean-Jeanine", 0, 25);
        Lion lion5 = new Lion("Jean-Pas-d-imagination", 25, 10);

        Lion[] lions = new Lion[] {lion1,lion2,lion3,lion4,lion5};

        Comparator<Lion> lionNameComparator = (l1,l2) ->
                l1.getName().compareTo(l2.getName());

        Comparator<Lion> lionAgeComparator =
                Comparator.comparing(l1 -> l1.getAge());

//        Arrays.sort(lions, lionAgeComparator.thenComparing(lionNameComparator));

        Arrays.sort(lions, Comparator.<Lion>naturalOrder().thenComparing(lionNameComparator));

        for (Lion lion: lions) {
            System.out.println(lion);
        }

    }
}
