package be.intecbrussel.LambdaOefening.Opdracht4;

import java.util.function.BiConsumer;

public class Opdracht4 {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer = (c1, c2) -> {
            System.out.println("sum of values: " + (c1 + c2));
        };
        consumer.accept(2, 5);

    }
}
