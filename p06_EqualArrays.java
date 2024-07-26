package f03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
boolean isIdentical = true;
int index = -1;
        for (int i = 0; i < firstArr.length; i++) {
           int first = firstArr[i];
           int second = secondArr[i];

            if (first == second) {
                sum += firstArr[i];
            }else {
                isIdentical = false;
                index = i;
                break;
            }
        }

        if(isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
}
}
