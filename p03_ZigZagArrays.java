package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            String firstElement = inputArr[0];
            String secondElement = inputArr[1];

            if(i % 2 ==0){
                secondArr[i-1] = firstElement;
                firstArr[i-1] = secondElement;
            }else{
                secondArr[i-1] = secondElement;
                firstArr[i-1] = firstElement;
            }
        }

        for (String e:firstArr){
            System.out.print(e + " ");
        }
        System.out.println();
        for (String p:secondArr){
            System.out.print(p + " ");
        }

    }
}
