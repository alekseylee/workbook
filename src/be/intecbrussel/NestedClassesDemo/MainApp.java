package be.intecbrussel.NestedClassesDemo;

public class MainApp {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("Value outer number: " +outerClass.getOuterNumber());
        outerClass.setOuterNumber(50);
        System.out.println("Value outer number: " +outerClass.getOuterNumber());

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("Value inner number: " +innerClass.getInnerNumber());
        innerClass.setInnerNumber(30);
        System.out.println("Value inner number: " +innerClass.getInnerNumber());

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println("Value static inner is: " +staticInnerClass.getStaticInnerNumber());
        staticInnerClass.setStaticInnerNumber(100);
        System.out.println("Value static inner is: " +staticInnerClass.getStaticInnerNumber());

    }
}
