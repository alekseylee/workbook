package be.intecbrussel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class StringOefeningScanner {
    public static void main(String [] args) {
        //oefening 1
//        String java = "Java Exercises!";
//        System.out.println(java.substring(0, 4));


        //oefening 2
//        String name = "walter, edwin, mike";
//        System.out.println("Do you have name edwin? " + name.contains("edwin"));

        //oefening 3

//        String str = "hello world";
//        char [] ch = str.toCharArray();
//
//        for(int i=0; i<str.length(); i++){
//            if('h'==str.charAt(i)){
//                ch[i] = 'H';
//            }
//            if('e'==str.charAt(i)){
//                ch[i] = 'e';
//            }
//            if('l'==str.charAt(i)){
//                ch[i] = 'L';
//            }
//            if('l'==str.charAt(i)){
//                ch[i] = 'l';
//            }
//            if('o'==str.charAt(i)){
//                ch[i] = 'O';
//            }
//            if('w'==str.charAt(i)){
//                ch[i] = 'W';
//            }
//            if('o'==str.charAt(i)){
//                ch[i] = 'o';
//            }
//            if('r'==str.charAt(i)){
//                ch[i] = 'R';
//            }
//            if('l'==str.charAt(i)){
//                ch[i] = 'l';
//            }
//            if('d'==str.charAt(i)){
//                ch[i] = 'D';
//            }
//        }
//        System.out.println(String.valueOf(ch));


        //oefening 4

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter word: ");
//        String word = scan.nextLine();
//
//        if (word.equals("palindroom")) {
//            System.out.println("Your word is: " + word);
//        } else {
//            System.out.println("Incorrect word");
//        }


        //oefening 5

//        String text = "The Quick BroWn FoX!";
//        System.out.println(text.toLowerCase());

        //oefening 6

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter name: ");
//        String name = scan.nextLine();
//        System.out.println("Please enter name of street: ");
//        String street = scan.nextLine();
//        System.out.println("Please enter phone number: ");
//        int number  = scan.nextInt();
//        System.out.println("\n\t Your name is: " + name);
//        System.out.println("\n\t Your address is: " + street);
//        System.out.println("\n\t Your number is: " + number);



        //oefening 7

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please first number: ");
//        int number1 = scan.nextInt();
//        System.out.println("Please second number: ");
//        int number2 = scan.nextInt();
//         if (number1 > number2) {
//             System.out.println(number1 + " is bigger than " +number2);
//         } else {
//             System.out.println(number2 + " is bigger than " +number1);
//         }


        //oefening 8

//    float a = 9.0f;
//    int b = 8;
//    float result01 = Math.max(b, 9.0F);
//    System.out.println(result01);

        //oefening 9

//        double result01 = Math.pow(5,4);
//        int solution = (int) result01;
//        System.out.println(solution);

        //oefening 10

//        double result = (Math.random() * 60);
//        int random = (int) result;
//        System.out.println("\nYour number is: " + random);
//
//        if(random % 2 == 0) {
//            System.out.println("\n Number " + random + " - is even ");
//
//        } else {
//            System.out.println("\n Number " + random + " - is oneven ");
//        }



        // oefening 11

//        Random  random = new Random();
//        int randomNum = random.nextInt();
//        for (int r=0; r<5; r++){
//            System.out.println(random.nextInt());
//        }
//
//        //  oefening 12

//        for (int r=0; r<6; r++){
//            System.out.println(random.nextInt(45));
//        }

        // oefening 12

//        Random randomGenerator = new Random();
//        int num = randomGenerator.nextInt(10);
//        boolean loop = true;
//
//        while(loop)
//        {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please enter a number from 1 to 10: ");
//            int numGuess  = scanner.nextInt();
//            if (numGuess >= 10) {
//                System.out.println("Incorrect number");
//            } else if (numGuess <= 0) {
//                System.out.println("Incorrect number");
//            } else if (numGuess > num) {
//                System.out.println("Guess lower!");
//            } else if (numGuess < num) {
//                System.out.println("Guess higher!");
//            } else if (numGuess == num) {
//                System.out.println("Correct! You win!!!");
//                loop = false;
//            }
//        }


        //oefening 13

//        String str1 = "a";
//        String str2 = "123";
//        String str3 = "55.99";
//        String str4 = "false";
//
//        Character c = new Character('a');
//        Integer i = new Integer(123);
//        Float f = new Float(55.99);
//        Boolean b = new Boolean(false);

        //solution 1
//        System.out.println(!str1.equals(c));
//        System.out.println(!str2.equals(i));
//        System.out.println(!str3.equals(f));
//        System.out.println(!str4.equals(b));


        //solution 2
//        boolean y = true;
//        boolean n = false;
//
//        char result1 = str1.charAt(0);
//        if (c == result1) {
//            System.out.println(y);
//        } else {
//            System.out.println(n);
//        }
//
//        int number2 = Integer.parseInt(str2);
//        if(number2 == i) {
//            System.out.println(y);
//        } else {
//            System.out.println(n);
//        }
//
//        float number3 = Float.parseFloat(str3);
//        if(number3 == f) {
//            System.out.println(y);
//        } else {
//            System.out.println(n);
//        }
//
//        boolean number4 = Boolean.parseBoolean(str4);
//        if(number4 == b) {
//            System.out.println(y);
//        } else {
//            System.out.println(n);
//        }



        //oefening 14
//        int numberInInt = 25;
//        double numberInDouble = 2.99;
//        char notANumber = 'j';
//
//        Integer convertedInt = numberInInt;
//        System.out.println(convertedInt);
//
//        Double convertedDouble = numberInDouble;
//        System.out.println(convertedDouble);
//
//        Character convertedNotANumber = notANumber;
//        System.out.println(convertedNotANumber);



//        //oefening 15
//
//        float myFloat = 9.56F;
//        System.out.println("Primitive float is: " + myFloat);
//        String myFloatString = String.valueOf(myFloat);
//        System.out.println("String float is: " + myFloatString);


        //oefening 16

//        LocalDate justTheDate = LocalDate.now();
//        LocalTime justTheTime = LocalTime.now();
//        LocalDateTime dateAndTheTimeNow = LocalDateTime.now();
//        System.out.println(justTheDate);
//        System.out.println(justTheTime);
//        System.out.println(dateAndTheTimeNow);

        //oefening 17

//        LocalDateTime dateAndTheTimeNow = LocalDateTime.now();
//        System.out.println("now: " + LocalDateTime.now());
//        System.out.println("Apr 15, 1994, 11:30am: " + LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
//        System.out.println("now (from Instant): " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
//        System.out.println("6 months from now: " + LocalDateTime.now().plusMonths(6));
//        System.out.println("6 months ago: " + LocalDateTime.now().minusMonths(6));

        // oefening 18




    }
}
