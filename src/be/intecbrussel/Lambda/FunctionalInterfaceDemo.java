package be.intecbrussel.Lambda;

import javax.swing.text.StyledEditorKit;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Runnable: doesn't require a input, doesn't give

        Runnable timeRunnable = () -> {
            System.out.println(LocalDateTime.now());
        };
        timeRunnable.run();

        //Consumer: requires input; doesn't give output(return)

        Consumer<Customer> customerConsumer = (Customer c) -> {
            System.out.println("This customer's age is: " +c.getAge());
        };
        customerConsumer.accept(new Customer(50));

        //Supplier: doesn't require anything, but give you something back

        Supplier <Integer> randomNUmberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(80);
        };
        int random = randomNUmberSupplier.get();
        System.out.println(random);

        //Function: require 2

        Function <String, Integer> letterCount = (String s) -> {
            return s.length();
        };

        int lengthOfWord = letterCount.apply("word");
        System.out.println(lengthOfWord);

        Function<Customer, Boolean> ageFunction = (Customer c) -> {
            if(c.getAge()<18) {
                return false;
            } else {
                return true;
            }
        };
    }
}
