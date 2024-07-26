package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p08_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");


        Double totalSum = 0.0;

        for (int i = 0; i < input.length; i++) {
            String combination = input[i];

            char firstLetter = combination.charAt(0);
            char secondLetter = combination.charAt(combination.length()-1);
            double number = Double.parseDouble(combination
                    .replace(firstLetter, ' ')
                    .replace(secondLetter, ' ')
                    .trim());

            if (Character.isUpperCase(firstLetter)) {
                int positionFirstLetter = (int) firstLetter - 64;
                number /= positionFirstLetter;
            } else {
                int positionFirstLetter = (int) firstLetter - 96;
                number *= positionFirstLetter;
            }

            if (Character.isUpperCase(secondLetter)) {
                int positionSecondLetter = (int) secondLetter - 64;
                number -= positionSecondLetter;
            } else {
                int positionSecondLetter = (int) secondLetter - 96;
                number += positionSecondLetter;
            }

            totalSum += number;

        }
        System.out.printf("%.2f", totalSum);
    }
}
