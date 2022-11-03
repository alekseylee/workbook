package be.intecbrussel.classwerk6;


import java.time.LocalTime;
import java.util.Scanner;

public class TijdsmetingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();
        System.out.println("Enter start time in hours");
        int startHours = scanner.nextInt();
        System.out.println("Enter start time in minutes");
        int startMinutes = scanner.nextInt();
        System.out.println("Enter stop time in hours");
        int stoptHours = scanner.nextInt();
        System.out.println("Enter stop time in in minutes");
        int stopMinutes = scanner.nextInt();

        for (int counter = 0; counter < counter + 1; counter++) {
            int totalHoursInMin = 0;
            if (( startHours <= 24 && startMinutes <= 60) && (startHours <= 24 && startMinutes <= 60)) {
                totalHoursInMin = (stoptHours - startHours) * 60;
                double totalMinWorked = stopMinutes - startMinutes;
                double totalTimeWorked = (totalMinWorked + totalHoursInMin)/60;
                double totalSalary = totalTimeWorked * 11.5;
                switch (day) {
                    case "Monday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Tuesday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Wednesday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Thursday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Friday":
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + totalSalary + " euros");
                        break;
                    case "Saturday":
                        double salarySaturday = totalSalary * 1.25;
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + salarySaturday + " euros");
                        break;
                    default:
                        double salarySunday = totalSalary * 1.50;
                        System.out.println("You are worked " + totalTimeWorked+ " hours, on " + day + " and you earned " + salarySunday + " euros");
                        break;
                }

                } else {
                System.out.println("Time not valid");
            }
        }
    }
}

