package be.intecbrussel.ArraysOefening;

import java.util.Scanner;




public class MainApp {
    public static void main(String[] args) {
        Search search = new Search();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String str = in.nextLine();
        System.out.println(str);

        System.out.print("\nYour input has " + search.count_Vowels(str) + "vowels");














    }
}

