package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p08_MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < numberArr.length; i++) {
            int firstElement = numberArr[i];

            for (int j = i+1; j < numberArr.length; j++) {
                int secondElement = numberArr[j];

                sum = firstElement + secondElement;

                if (sum == magicSum){
                    System.out.println(firstElement + " " + secondElement);
                }
            }
        }
    }
}
