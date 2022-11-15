package be.intecbrussel.Lambda;

public class Bartender {

    public void serveADrink(String drink, Customer customer) {
        if (customer.getAge() > 17) {
            System.out.println("Serving: " + drink + "to :" + customer);
        } else {
            System.out.println("You are too young");
        }
    }
}