package be.intecbrussel.NestedORInnerClass.example1;

public class MainApp {
    public static void main(String[] args) {

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println("Static inner X = " + innerClass.getStaticInnerX());

    }
}
