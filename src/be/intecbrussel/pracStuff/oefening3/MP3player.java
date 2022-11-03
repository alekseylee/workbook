package be.intecbrussel.pracStuff.oefening3;

import java.util.Scanner;

public class MP3player {
    public static void main(String[] args) {

        int memorySize = 10;
        Scanner scanner = new Scanner(System.in);

        while (memorySize > 0) {
            System.out.println("Enter song genre");
            String genre = scanner.nextLine().toUpperCase();

            switch (genre) {
                case "POP":
                    System.out.println("Your song is added");
                    memorySize--;
                    System.out.println("Your memory is: " + memorySize);
                    break;
                case "ROCK":
                    System.out.println("Your song is added");
                    memorySize--;
                    System.out.println("Your memory is: " + memorySize);
                    break;
                case "TECHNO":
                    System.out.println("Your song is added.");
                    memorySize--;
                    System.out.println("Your memory is: " + memorySize);
                    break;
                case "RAP":
                    System.out.println("Skipped");
                    System.out.println("Your memory is: " + memorySize);
                    break;
                case "R&B":
                    System.out.println("Skipped");
                    System.out.println("Your memory is: " + memorySize);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
