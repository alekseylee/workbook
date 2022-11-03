package be.intecbrussel.NestedORInnerClass.example1;

public class OuterClass {
    private int outerX = 10;
    public static class InnerClass{
        private int staticInnerX = 5;
        // getters and setters InnerClass
        public int getStaticInnerX() {
            return staticInnerX;
        }
        public void setStaticInnerX(int staticInnerX) {
            this.staticInnerX = staticInnerX;
        }
    }
    // getters and setters OuterClass
    public int getOuterX() {
        return outerX;
    }
    public void setOuterX(int outerX) {
        this.outerX = outerX;
    }
}
