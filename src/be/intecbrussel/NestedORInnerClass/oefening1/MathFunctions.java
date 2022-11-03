package be.intecbrussel.NestedORInnerClass.oefening1;

import java.util.Scanner;

public class MathFunctions implements Product {
    Scanner scanner = new Scanner(System.in);
    @Override
    public double multiply() {
        System.out.println("Enter 1 number for multiply:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter 2 number for multiply:");
        double number2 = scanner.nextDouble();
        scanner.close();
        return number1*number2;
    }

    @Override
    public double division() {
        System.out.println("Enter 1 number for division:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter 2 number for division:");
        double number2 = scanner.nextDouble();
        scanner.close();
        return number1/number2;
    }

    static class InnerClass{
        Scanner scan = new Scanner(System.in);

        int getSum(){
            System.out.println("Enter 1 number for sum value:");
            int a = scan.nextInt();
            System.out.println("Enter 2 number for sum value:");
            int b = scan.nextInt();
            scan.close();
            return Integer.sum(a,b);
        }

        int getMin() {
            System.out.println("Enter 1 number for get know min value:");
            int a = scan.nextInt();
            System.out.println("Enter 2 number for get know min value:");
            int b = scan.nextInt();
            scan.close();
            return Math.min(a,b);
        }
        int getMax() {
            System.out.println("Enter 1 number for get know man value:");
            int a = scan.nextInt();
            System.out.println("Enter 2 number for get know max value:");
            int b = scan.nextInt();
            scan.close();
            return Math.max(a,b);
        }
    }
}
