package be.intecbrussel.ArraysOefening;

import java.util.Scanner;

public class Search {
    String str;
    public static int count_Vowels(String str)
    {
        int vcount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.print(" | " + ch);
                vcount++;
            }
        }
        return vcount;

    }
}


