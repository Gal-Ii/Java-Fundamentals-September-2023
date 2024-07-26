package f05_List_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p02_CarRase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        double sum = 0;
        double sumTwo = 0;

        for (int i = 0; i < numberArr.length / 2; i++) {
        int number = numberArr[i];

        if(number == 0){
            sum = sum - (sum*20)/100;
        }
        sum += number;
        }

        for (int i = numberArr.length-1; i > numberArr.length / 2; i--) {
            int number = numberArr[i];

            if(number == 0){
                sumTwo = sumTwo - (sumTwo*20)/100;
            }
            sumTwo += number;
        }

        if(sum<sumTwo){
            System.out.printf("The winner is left with total time: %.1f", sum);
        }else {
            System.out.printf("The winner is right with total time: %.1f", sumTwo);
        }
    }
}
