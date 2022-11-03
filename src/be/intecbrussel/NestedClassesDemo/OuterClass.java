package be.intecbrussel.NestedClassesDemo;

public class OuterClass {

    // propertie(s)
    private int outerNumber = 10;
    // constructor(s)

    //getters and setters, Methods

    public int getOuterNumber() {
        return outerNumber;
    }

    public void setOuterNumber(int outerNumber) {
        this.outerNumber = outerNumber;
    }

    public class InnerClass {
        // propertie(s)
        private int innerNumber = 5;

        // constructor(s)

        //getters and setters, Methods

        public int getInnerNumber() {
            return innerNumber;
        }

        public void setInnerNumber(int innerNumber) {
            this.innerNumber = innerNumber;
        }
    }

    public static class StaticInnerClass {
        // propertie(s)
        private int staticInnerNumber = 50;

        // getter and setter


        public int getStaticInnerNumber() {
            return staticInnerNumber;
        }

        public void setStaticInnerNumber(int staticInnerNumber) {
            this.staticInnerNumber = staticInnerNumber;
        }
    }

}
