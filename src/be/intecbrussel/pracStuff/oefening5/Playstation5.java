package be.intecbrussel.pracStuff.oefening5;

import be.intecbrussel.classwerk8.Arrays;
import be.intecbrussel.pracStuff.shoesOefenings.ShoePair;

import java.sql.Array;
import java.util.Random;

public class Playstation5 {
    public static void main(String[] args) {

        Random  random = new Random();
        int randomNum = random.nextInt(20);
        int[] gameConsole = {randomNum,randomNum,randomNum,randomNum,randomNum,randomNum,randomNum,randomNum,randomNum,randomNum};
        for (int r=0; r< gameConsole.length; r++){
           if (randomNum == 5 && randomNum == 11) {
               System.out.println("You bought your PS5");
           }
        }

//        int [] studentPoint = {1,5,6, -9, 77 ,110, -4, 3, 10, 2};
//
//        for (int x = 0; x < studentPoint.length; x++){
//            if (studentPoint[x] > 0 && studentPoint[x] <= 3) {
//                System.out.print(studentPoint[x] * 3 + " ");
//            } else if (studentPoint[x] >3 && studentPoint[x] <=10) {
//                System.out.print(studentPoint[x] + " ");
//            } else if (studentPoint[x] >= 10) {
//                System.out.print(studentPoint[x] / 11 + " ");
//            } else if (studentPoint[x] < 0) {
//                System.out.print(studentPoint[x] * -1 + " ");
//            }







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



//

    }
}
