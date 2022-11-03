package be.intecbrussel.pracStuff.oefening4;

import java.util.Scanner;

public class CoronaTime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you age: ");
        int age = scan.nextInt();
        int risicolevel = 0;

        if (age > 65) {
            risicolevel = 3;
            System.out.println("You risk level is " + risicolevel);

        } else if (age >= 45 && age <=65) {
            risicolevel = 2;
            System.out.println("You risk level is " + risicolevel);

        } else if (age >= 45 && age <=65) {
            risicolevel = 1;
            System.out.println("You risk level is " + risicolevel);

        } else {
            System.out.println("You risk level is " + risicolevel);
        }

        switch (risicolevel) {
            case 3:
                System.out.println("Please take this vaccine now!");
                break;
            case 2:
                System.out.println("Let’s take your temperature first.");
                break;
            case 1:
                System.out.println("Any antecedents?");
                break;
            case 0:
                System.out.println("Go home!");
                break;
        }
    }
}
