package be.intecbrussel.pracStuff.oefening2;

import java.util.Scanner;

public class ValentinesDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stock1;
        System.out.println("What's price do u sell 1 stock? (0 - 400 euros) ");
        stock1 = scan.nextInt();

        int stock2;
        System.out.println("What's price do u sell 2 stock? (0 - 400 euros) ");
        stock2 = scan.nextInt();

        int sum = stock1 + stock2;

        if(sum >= 750) {
            System.out.println("Congratulations! You will marry!");
        } else if (sum > 750 && sum >= 300) {
            System.out.println("You can buy new Ipad");
        } else if (sum >300 && sum >= 100) {
            System.out.println("You can go to restaurant");
        } else {
            System.out.println("Not enough gold :)");
        }
    }
}
