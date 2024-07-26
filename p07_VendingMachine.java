package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double price = 0;
        double sum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            sum += coins;
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f\n", coins);
                sum -= coins;
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
            while (!product.equals("End")) {
                switch (product) {
                    case "Nuts":
                        price = 2.0;

                        if (sum >= price) {
                            System.out.println("Purchased Nuts");
                            sum -= price;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }

                        break;
                    case "Water":
                        price = 0.7;

                        if (sum >= price) {
                            System.out.println("Purchased Water");
                            sum -= price;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Crisps":
                        price = 1.5;

                        if (sum >= price) {
                            System.out.println("Purchased Crisps");
                            sum -= price;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Soda":
                        price = 0.8;

                        if (sum >= price) {
                            System.out.println("Purchased Soda");
                            sum -= price;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Coke":
                        price = 1.0;

                        if (sum >= price) {
                            System.out.println("Purchased Coke");
                            sum -= price;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                        break;

                }
                product = scanner.nextLine();
            }

            System.out.printf("Change: %.2f\n", sum);

    }
}
