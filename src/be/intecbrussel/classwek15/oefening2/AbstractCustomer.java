package be.intecbrussel.classwek15.oefening2;

public abstract class AbstractCustomer {
    protected String name;


        public String getName() {
            return name;
        }

        public boolean isNil() {
            return false;
        }

        public AbstractCustomer(String name){
            this.name=name;
        }
}
