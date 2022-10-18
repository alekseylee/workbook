package be.intecbrussel.basisprogramoefening;
import java.util.Scanner;
public class basisprogramoefening {
    public static void main(String [] args) {

//        oefening 1

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number 1 -  255");
//        int number = scan.nextInt();
//
//        String message = (number % 2 == 0) ? "True" : "False";
//
//        if(number % 2 == 0) {
//            System.out.println(number + " is even - " + message);
//
//        } else {
//            System.out.println(number + " is even - " + message);
//
//        }

        //oefening 2

//        Scanner scan = new Scanner(System.in);

//        double length;
//        System.out.println("Enter length: ");
//        length = scan.nextDouble();
//
//        double radius;
//        System.out.println("Enter radius: ");
//        radius = scan.nextDouble();
//
//        double pi = 3.14285714286;
//
//        double area = pi * (radius * radius) * length;
//
//        System.out.println("The volume of Cylinder is: " + area + "\n");

        //oefening 3

//        int hours = 24;
//
//        for (int study = 0; study < hours +1; study++) {
//            if(study == 3) {
//                System.out.println("3 hours study");
//                continue;
//            } else if(study == 5) {
//                 break;
//            }
//            System.out.println(study);
//        }

        //oefening 4

//        Scanner scan = new Scanner(System.in);

//        int number;
//        System.out.println("8996305115 we can / 5 or 6? ");
//        number = scan.nextInt();
//        long num = 8996305115L;
//
//        if(num % number == 0) {
//            System.out.println("Yes, you can divide by 5");
//        } else {
//            System.out.println("No, you can divide by 6");
//        }



        //oefening 5

//        Scanner scan = new Scanner(System.in);
//
//        int stock1;
//        System.out.println("What's price do u sell 1 stock? (0 - 400 euros) ");
//        stock1 = scan.nextInt();
//
//        int stock2;
//        System.out.println("What's price do u sell 2 stock? (0 - 400 euros) ");
//        stock2 = scan.nextInt();
//
//        int sum = stock1 + stock2;
//
//        if(sum >= 750) {
//            System.out.println("Congratulations! You will marry!");
//        } else if (sum > 750 && sum >= 300) {
//            System.out.println("You can buy new Ipad");
//        } else if (sum >300 && sum >= 100) {
//            System.out.println("You can go to restaurant");
//        } else {
//            System.out.println("Not enough gold :)");
//        }


        //oefening 6

//            int i,j,count=0;
//
//            for (i=20; i<=100; i++) {
//                for(j=1; j<=i/2; j++)
//                {
//                    if(i % j == 0)
//                        count++;
//                }
//                if(count == 1)
//                    System.out.println("Prime number " + i);
//                count=0;
//            }

        //oefening 7
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter you age: ");
//        int age = scan.nextInt();
//        int risicolevel = 0;
//
//        if (age > 65) {
//            risicolevel = 3;
//            System.out.println("You risk level is " + risicolevel);
//
//        } else if (age >= 45 && age <=65) {
//            risicolevel = 2;
//            System.out.println("You risk level is " + risicolevel);
//
//        } else if (age >= 45 && age <=65) {
//            risicolevel = 1;
//            System.out.println("You risk level is " + risicolevel);
//
//        } else {
//            System.out.println("You risk level is " + risicolevel);
//        }
//
//        switch (risicolevel) {
//            case 3:
//                System.out.println("Please take this vaccine now!");
//                break;
//            case 2:
//                System.out.println("Let’s take your temperature first.");
//                break;
//            case 1:
//                System.out.println("Any antecedents?");
//                break;
//            case 0:
//                System.out.println("Go home!");
//                break;
//        }


        //oefening 8

//        int num = 100, i = 0, sum = 0;
//        while(i <= num)
//        {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum of First 100 Natural Numbers is = " + sum);

        //oefening 9
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter you Brutto salary: ");
//        int salary = scan.nextInt();
//        double tax;
//
//        if (salary > 3000) {
//            tax = 38;
//            double netto;
//            double taxNetto;
//            double taxNetto1;
//            double salaryNetto;
//            taxNetto = tax/100;
//            taxNetto1 = salary * taxNetto;
//            netto = salary - taxNetto1;
//            System.out.println("\nYour tax is 38%: " + taxNetto1 + " euro");
//            System.out.println("\nYour netto salary is: " + netto + " euro");
//
//        } else if (salary >= 2000 && salary <= 3000) {
//            tax = 35;
//            double netto;
//            double taxNetto;
//            double taxNetto1;
//            double salaryNetto;
//            taxNetto = tax/100;
//            taxNetto1 = salary * taxNetto;
//            netto = salary - taxNetto1;
//            System.out.println("\nYour tax is 35%: " + taxNetto1 + " euro");
//            System.out.println("\nYour netto salary is: " + netto + " euro");
//
//        } else if (salary < 2000) {
//            tax = 27;
//            double netto;
//            double taxNetto;
//            double taxNetto1;
//            double salaryNetto;
//            taxNetto = tax/100;
//            taxNetto1 = salary * taxNetto;
//            netto = salary - taxNetto1;
//            System.out.println("\nYour tax is 27%: " + taxNetto1 + " euro");
//            System.out.println("\nYour netto salary is: " + netto + " euro");
//        }
//
//        switch (salary) {
//            case 1:
//                System.out.println("Your tax is 38%");
//                break;
//            case 2:
//                System.out.println("Your tax is 35%");
//                break;
//            case 3:
//                System.out.println("Your tax is 27%");
//                break;
//        }


    }
}














