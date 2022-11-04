package be.intecbrussel.classwek15.oefening2;

public class NullCustomer extends AbstractCustomer {
    private String name;

    public NullCustomer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        String anwser = "Not Available in Customer Database";
        return anwser;
    }

    @Override
    public boolean isNil() {
        return true;
    }
}

