package be.intecbrussel.classwek15.oefening2;

public class CustomerFactory {
    final static String[] NAMES = {"bob", "terry", "mark", "kenny"};

    public static AbstractCustomer getCustomer(String name) {

        AbstractCustomer customer = null;

        for (int i = 0; i < NAMES.length; i++) {

            if (NAMES[i].equals(name)) {
                customer = new RealCustomer(name);
                break;
            } else {
                customer = new NullCustomer(name);
            }
        }
        return customer;
    }
}


