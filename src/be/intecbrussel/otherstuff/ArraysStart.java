package be.intecbrussel.otherstuff;

import java.util.Arrays;

public class ArraysStart {
    public static void main(String[] args) {

        //array is een verzameling van elements

        // elements -> data -> primitieve datatypes (byte, int, double, boolean)
        // objecten erin zetten -> String

        // we moeten meegeven hoe groot dat een array moet zijn.

        int[] myIntArr = new int[10];
        // keyword new dat we spreken over een object.

        byte[] myByteArr = {1,10,100} ;
        //index van de array -> index begint altijd van 0

        //loop
        int[] myArr = {100,200,300};

        for(int element : myArr) {
            System.out.println(element);
        }


    }
}
