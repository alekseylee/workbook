package be.intecbrussel.NestedORInnerClass.oefening1;

public class MainApp {
    public static void main(String[] args) {

        MathFunctions.InnerClass innerClassCheck = new MathFunctions.InnerClass();
        System.out.println("Summary value is: " + innerClassCheck.getSum());
        System.out.println("Max value is: " + innerClassCheck.getMax());
        System.out.println("Min value is: " + innerClassCheck.getMin());

        MathFunctions mathFunctions1 = new MathFunctions();
        System.out.println("Multiply of your numbers: " + mathFunctions1.multiply());
        System.out.println("Division of you numbers: " + mathFunctions1.division());

    }
}
