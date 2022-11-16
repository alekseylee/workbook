package be.intecbrussel.LambdaOefening.Opdracht5;

import java.util.function.Supplier;
import java.util.stream.IntStream;


public class Opdracht5 {
    public static void main(String[] args) {

        Supplier<IntStream> supplier=()->IntStream.of(5, 8, 640, 1111, 27, 16);

        supplier.get()
                .map(x->x/4)
                .filter(x->x%8==0)
                .sorted()
                .forEach(System.out::println);

    }
}
