package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < input.length - 1; i++) {
            int firstNumber = input[i];
            boolean isBigger = true;

            for (int j = i; j < input.length - 1; j++) {
                int number2 = input[j + 1];
                if (firstNumber <= number2) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(firstNumber + " ");
            }
        }
            System.out.print(input[input.length - 1]);
    }
}
