package be.intecbrussel.NestedORInnerClass.example2;

public class MainApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("OuterClass X = " + outerClass.getOuterX() + ", InnerClass X = " +
                innerClass.getInnerX());

    }
}
