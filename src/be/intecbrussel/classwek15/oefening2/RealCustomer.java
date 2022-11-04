package be.intecbrussel.classwek15.oefening2;

public class RealCustomer extends AbstractCustomer{
    private String name = "Loren";


    public RealCustomer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isNil() {
        return super.isNil();
    }

}

