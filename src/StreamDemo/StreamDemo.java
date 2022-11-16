package StreamDemo;

import be.intecbrussel.Lambda.Customer;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        String [] myCollectionOfStrings = {"Catapult", "Turtle", "Blue", "Eyes", "White", "DraGon"};
        Stream.of(myCollectionOfStrings)
//                .map(word -> word.toLowerCase())
//                .filter(word -> word.contains("e"))
//                .map(word -> word.length())
//                .filter(number -> number%2==0)
//                .map(number -> number/2)
//                .sorted()
//                .forEach(word -> System.out.println(word));
                .map(String::toLowerCase)
                .filter(word -> word.contains("e"))
                .map(String::length)
                .filter((number -> number%2==0))
                .map(Integer::byteValue)
                .sorted()
                .forEach(word -> System.out.println(word));

        Customer [] customers = {new Customer("Annie",30), new Customer("Pablo",15)
                ,new Customer("Said",23),new Customer("Kofi",17),new Customer("Yulian",40)};

//        Stream.of(customers)
//                .filter(customer -> customer.getAge()>17)
//                .map(customer -> customer.setName("Slim Shady"))
//                .forEach(customer -> System.out.println(customer));

        Customer[] legalCustomers = Stream.of(customers)
                .filter(customer -> customer.getAge()>17)
                .map(customer -> customer.setName("Slim Shady"))
//                .map(customer -> customer.getAge())    error(exception)
                .toArray(Customer[]::new);
        System.out.println(Arrays.toString(legalCustomers));

    }
}
