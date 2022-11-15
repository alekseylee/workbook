package be.intecbrussel.Lambda;

public class Bar {
    public static void main(String[] args) {


        Customer customer1 = new Customer(18);
        Customer customer2 = new Customer(8);
        Customer customer3 = new Customer(118);
        Customer customer4 = new Customer(16);



        Bartender bartender = new Bartender();
        Promoter promoter = new Promoter();
        WCLady wcLady = new WCLady();

//        Bouncer bouncer = new Bouncer();
//        if(bouncer.checkAge(customer1))
        AgeChecker ageChecker =  (Customer c) -> {
            if(c.getAge()<18) {
                return false;
            } else {
                return true;
            }
        };

        if (ageChecker.checkAge(customer1)) {
            bartender.serveADrink("Pina Colada", customer1);
        }
        if(ageChecker.checkAge(customer2)) {
            bartender.serveADrink("Pina Colada", customer2);
        }
        if(ageChecker.checkAge(customer3)) {
            bartender.serveADrink("Pina Colada", customer3);
        }
    }
}
