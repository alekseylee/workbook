package be.intecbrussel.NestedORInnerClass.example2;

public class OuterClass {
    private int outerX = 10;
    public class InnerClass{
        private int innerX = 5;
        // getters and setters inner class
        public int getInnerX() {
            return innerX;
        }
        public void setInnerX(int innerX) {
            this.innerX = innerX;
        }
    }
    // getters and setters outer class
    public int getOuterX() {
        return outerX;
    }
    public void setOuterX(int outerX) {
        this.outerX = outerX;
    }
}
