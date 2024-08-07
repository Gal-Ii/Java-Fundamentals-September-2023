package f03_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p03_SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        int evenSum = 0;

        for (int i = 0; i < numbersArr.length; i++) {

            if(numbersArr[i] % 2 == 0){
                evenSum += numbersArr[i];
            }
        }
        System.out.println(evenSum);
    }
}
