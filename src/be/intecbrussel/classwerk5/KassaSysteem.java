package be.intecbrussel.classwerk5;


import java.util.Scanner;

public class KassaSysteem {
        private String nameProduct;
        private static int counter = 0;

        public KassaSysteem() {
            counter++;
        }


        public double KassaSysteem(String nameProduct) {
            this.nameProduct = nameProduct;
            counter++;

            return 2;
        }


        public static int getCounter() {
            return counter;
        }

        public void setNameProduct() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose product: \n\t brood \n\t melk \n\t apple" +
                    " \n\t stokbrood \n\t koffie ");
            nameProduct = scanner.nextLine();

            double brood = 2.50;
            double melk = 1.25;
            double apple = 0.50;
            double stokbrood = 0.75;
            double koffie = 3.00;
            double sum = 0;


            for (int counter = 0; counter < counter + 1; counter++) {
                if (nameProduct != "stop") {
                    switch (nameProduct) {
                        case "brood":
                            System.out.println("Brood price is: " + brood + " euro.");
                            sum += 2.50;
                            System.out.println("Your total price is: " + (sum));
                            System.out.println("Choose product: ");
                            nameProduct = scanner.nextLine();
                            continue;
                        case "melk":
                            System.out.println("Melk price is: " + (melk) + " euro");
                            sum += 1.25;
                            System.out.println("Your total price is: " + (sum));
                            System.out.println("Choose product: ");
                            nameProduct = scanner.nextLine();
                            continue;
                        case "apple":
                            System.out.println("Apple price is: " + (apple) + " euro");
                            sum += 0.50;
                            System.out.println("Your total price is: " + sum);
                            System.out.println("Choose product: ");
                            nameProduct = scanner.nextLine();
                            continue;
                        case "stokbrood":
                            System.out.println("Stokbrood price is: " + (stokbrood) + " euro");
                            sum += 0.75;
                            System.out.println("Your total price is: " + sum);
                            System.out.println("Choose product: ");
                            nameProduct = scanner.nextLine();
                            continue;
                        case "koffie":
                            System.out.println("Koffie price is: " + (koffie) + " euro");
                            sum += 3.00;
                            System.out.println("Your total price is: " + sum);
                            System.out.println("Choose product: ");
                            nameProduct = scanner.nextLine();
                            continue;
                        default:

                            System.out.println("Your total price is: " + sum);
                            System.out.println("You bought - " + counter + " products.");
                            System.exit(-1);
                            break;
                    }
                } else {
                    this.nameProduct = nameProduct;
                }
            }
        }
}









