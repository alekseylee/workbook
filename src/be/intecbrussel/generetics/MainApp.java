package be.intecbrussel.generetics;


import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        // example 1
//        Predicate<String > condition = element ->
//                element != null && !element.isEmpty();

        Predicate<String> stringIsNotNull = element -> element != null;
        Predicate<String> stringIsNotEmpty = element -> !element.isEmpty();

        String [] strArr = {"Hello", "World", "", null, "Generic"};
        System.out.println(Arrays.toString(strArr));

        Stream.of(strArr)
                .peek(System.out::println)
                .filter(stringIsNotNull)
                .filter(stringIsNotEmpty)
                .forEach(word -> System.out.println("Filtered: " +word));




        // example 1
//        Stream.of(strArr)
//                .peek(System.out::println)
//                .filter(condition)
//                .forEach(word -> System.out.println("Filtered: " +word));

    }
}
