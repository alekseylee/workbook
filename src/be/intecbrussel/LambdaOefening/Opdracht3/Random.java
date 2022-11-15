package be.intecbrussel.LambdaOefening.Opdracht3;

import java.util.function.Supplier;

public class Random {
    public static void main(String[] args) {

        Supplier<Integer> randomNUmberSupplier = () -> {
            java.util.Random random = new java.util.Random();
            return random.nextInt(4);
        };

        /*Solution 1*/
//        int random = randomNUmberSupplier.get();
//        switch (random) {
//            case 1:
//                System.out.println(random + " -> 25%");
//                break;
//            case 2:
//                System.out.println(random + " -> 50%");
//                break;
//            case 3:
//                System.out.println(random + " -> 75%");
//                break;
//            case 4:
//                System.out.println(random + " -> 100%");
//                break;
//            default:
//                System.out.println(random + " -> 0%");
//                break;
//        }

        /*Solution 2*/
//        int random = randomNUmberSupplier.get();
//        if (random < 1) {
//            System.out.println(random + " -> 0%");
//        } else if (random == 1) {
//            System.out.println(random + " -> 25%");
//        } else if (random == 2) {
//            System.out.println(random + " -> 50%");
//        } else if (random == 3) {
//            System.out.println(random + " -> 75%");
//        } else {
//            System.out.println(random + " -> 100%");
//        }



    }
}