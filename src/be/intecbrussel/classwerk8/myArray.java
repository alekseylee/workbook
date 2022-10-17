package be.intecbrussel.classwerk8;

import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
//        int[] myIntArray = {10, 25, 30, 45, 70};
//        int[] newArray = Arrays.copyOf(myIntArray, 5);
//        System.out.println("\nNew array newArray after modifications:");
//        for (int index = 0; index < newArray.length; index++) {
//            System.out.print(newArray[index] + " ");

            //oefening 2

        int[] newArray = {1, 5, 20, 30, 40, 50};
            Arrays.sort(newArray);
            System.out.println(Arrays.toString(newArray));

            int secondLargest = 0;

            for (int i = newArray.length -2; i > 0; i--) {
                if (newArray[i] != newArray[newArray.length -1]) {
                    secondLargest = newArray[i];
                    break;
                }
                System.out.println("Second Largest = " + secondLargest);
            }

//            int highest = newArray[0];
//            int secondHighest = newArray[0];
//            boolean find = false;
//            boolean flag = true;
//            while (flag) {
//                for (int i = 0; i < newArray.length; i++) {
//                    if (newArray[i] > highest) {
//                        find = true;
//                        secondHighest = highest;
//                        highest = newArray[i];
//                    } else if (newArray[i] > secondHighest) {
//                        find = true;
//                        secondHighest = newArray[i];
//                    }
//                }
//                if (find) {
//                    System.out.println("Second largest number is:" + secondHighest);
//                    flag = false;
//                } else {
//                    highest = newArray[1];
//                    secondHighest = newArray[1];
//                }
//            }
    }
}




