package be.intecbrussel.ArraysOefening;

import java.util.Scanner;

import static be.intecbrussel.ArraysOefening.Search.count_Vowels;

public class MainApp {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String str = in.nextLine();
        System.out.println(str);

        System.out.print("\nYour input has " + count_Vowels(str) + "vowels");














    }
}

