package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i <= input.length-1; i++) {
            int middleElement = input[i];
            rightSum = 0;
            leftSum = 0;

            for (int j = i+1; j <= input.length-1; j++) {
                if (input[i]==input.length-1){
                    rightSum = 0;
                }
                rightSum += input[j];
            }


            for (int k = 0; k <i; k++) {
                if(input[i]==0){
                    leftSum = 0;
                }
                leftSum += input[k];
            }


            if (leftSum == rightSum){
                System.out.println(i);
                break;
            }
        }
        if (leftSum != rightSum){
            System.out.println("no");
        }

    }
}
