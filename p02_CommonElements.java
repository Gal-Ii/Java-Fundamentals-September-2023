package f03_Arrays_Exercise;

import java.util.Scanner;

public class p02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            String secondElement = secondArr[i];

            for (int j = 0; j < firstArr.length; j++) {
                String firstElement = firstArr[j];

                if (secondElement.equals(firstElement)){
                    System.out.print(secondElement + " ");
                }
            }


        }
    }
}
