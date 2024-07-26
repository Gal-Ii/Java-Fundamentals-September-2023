package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double total = 0;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = 8.45;
            } else if (type.equals("Business")) {
                price = 10.90;
            } else if (type.equals("Regular")) {
                price = 15;
            }
        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = 9.80;
            } else if (type.equals("Business")) {
                price = 15.60;
            } else if (type.equals("Regular")) {
                price = 20;
            }
        } else if (day.equals("Sunday")) {
            if (type.equals("Students")) {
                price = 10.46;
            } else if (type.equals("Business")) {
                price = 16;
            } else if (type.equals("Regular")) {
                price = 22.50;
            }
        }
        total = price * numberOfPeople;
        if (numberOfPeople >= 30 && type.equals("Students")) {
            total = total - (total * 15) / 100;
        } else if (numberOfPeople >= 100 && type.equals("Business")) {
            total = total - 10 * price;
        } else if (numberOfPeople >= 10 && numberOfPeople <= 20 && type.equals("Regular")) {
            total = total - (total * 5) / 100;
        }

        System.out.printf("Total price: %.2f", total);
    }
}
