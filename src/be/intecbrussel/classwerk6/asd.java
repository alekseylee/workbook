package be.intecbrussel.classwerk6;

import java.time.LocalTime;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

        System.out.println("-------oefening 3-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();
        System.out.println("Enter start-uur (in uren)");
        int startUur = scanner.nextInt();
        System.out.println("Enter start-uur (in minuten)");
        int startMinute = scanner.nextInt();

        System.out.println("Enter stop-uur (in uren)");
        int stoptUur = scanner.nextInt();
        System.out.println("Enter stop-uur (in minuten)");
        int stopMinute = scanner.nextInt();

        LocalTime time1 = LocalTime.of(startUur, startMinute);
        LocalTime time2 = LocalTime.of(23, 59);
        LocalTime time3 = LocalTime.of(0, 0);
        LocalTime time4 = LocalTime.of(stoptUur, stopMinute);

        long diff1 = time2.getHour() - time1.getHour();
        long diff2 = time2.getMinute() - time1.getMinute() + 1;
        long diff3 = time4.getHour() - time3.getHour();
        long diff4 = time4.getMinute() - time3.getMinute();
//System.out.println((diff1 + diff3) + " hours, " + (diff2 + diff4) + " minutes");

        diff1 *= 60;
        diff3 *= 60;
        int hours = (int) ((diff1 + diff2 + diff3 + diff4) / 60);
        int minutes = (int) ((diff1 + diff2 + diff3 + diff4) % 60);
        System.out.println("You worked :" + hours + " hours, " + minutes + " minutes");

        double salary = 0;

        for (int counter = 0; counter < counter + 1; counter++) {
            if (day != "stop") {
                switch (day) {
                    case "Monday":

                        salary += 11.5 * hours + 11.5 * (minutes / 60.0);
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;

                    case "Tuesday":
                        salary += 11.5 * hours + 11.5 * (minutes / 60.0);
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    case "Wednesday":
                        salary += 11.5 * hours + 11.5 * (minutes / 60.0);
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    case "Thursday":
                        salary += 11.5 * hours + 11.5 * (minutes / 60.0);
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    case "Friday":
                        salary += 11.5 * hours + 11.5 * (minutes / 60.0);
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    case "Saturday":
                        salary += 1.25 * (11.5 * hours + 11.5 * (minutes / 60.0));
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    case "Sunday":
                        salary += 1.5 * (11.5 * hours + 11.5 * (minutes / 60.0));
                        System.out.println("You earned: " + salary + " euro.");
                        System.out.println("Choose product: ");
                        day = scanner.nextLine();
                        continue;
                    default:
                        System.out.println("Day number doesn't exists");
                        System.out.println("Total" + salary);
                        break;
                }

            }
        }

    }

}
