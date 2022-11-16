package be.intecbrussel.LambdaOefening.Opdracht6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MyAnimalList {
    public static void main(String[] args) {


        String [] animals = {"Cow", "ShaRk", "DOg", "PirAnha", "MouSE", "CaT", "ParRoT", "DOLphin"};
        String [] myNewArray2 = Arrays.stream(animals).toArray(String[]::new);
        Stream.of(myNewArray2)
                .map(String::toLowerCase)
                .filter(value -> value.contains("a"))
                .forEach(value -> System.out.println(value));

    }
}
