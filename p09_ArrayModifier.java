package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();

        while (!input.contains("end")) {

            if (input.contains("decrease")) {
                for (int i = 0; i <= numberArr.length - 1; i++) {
                    numberArr[i] -= 1;
                }
            }
            String[] command = input.split(" ");

            if (input.contains("swap")) {

                int indexOne = Integer.parseInt(command[1]);
                int indexTwo = Integer.parseInt(command[2]);
                int firstNumber = numberArr[indexOne];
                int secondNumber = numberArr[indexTwo];

                numberArr[indexOne] = secondNumber;
                numberArr[indexTwo] = firstNumber;
            }
            if (input.contains("multiply")) {
                int indexOne = Integer.parseInt(command[1]);
                int indexTwo = Integer.parseInt(command[2]);
                int firstNumber = numberArr[indexOne];
                int secondNumber = numberArr[indexTwo];
                firstNumber *= secondNumber;
                numberArr[indexOne] = firstNumber;
            }

            input = scanner.nextLine();
        }

            System.out.print(Arrays.toString(numberArr)
                    .replace("[", "")
                    .replace("]", ""));

    }
}
