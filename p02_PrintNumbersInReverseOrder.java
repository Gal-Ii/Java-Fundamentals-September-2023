package f03_Arrays;

import java.util.Scanner;

public class p02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] numbersArr = new int[input];
        for (int i = 0; i < input; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            numbersArr[i] = numbers;
        }

        for (int i = numbersArr.length-1; i >=0 ; i--) {
            System.out.printf("%d ", numbersArr[i]);
        }





    }
}
