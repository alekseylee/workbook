package be.intecbrussel.otherstuff;

import java.time.LocalDate;
import java.time.Period;

    public class AgeCalculator {
    public static void main(String args[])
    {

        LocalDate dob = LocalDate.of(1989, 06, 19);

        LocalDate curDate = LocalDate.now();

        Period period = Period.between(dob, curDate);
         System.out.printf("I am %d years, %d months and %d days old.", period.getYears(), period.getMonths(), period.getDays());
    }
}  