package f04_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class p10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));


        System.out.println(multiply(num));
    }

    public static int multiply(int num){
       return  evenNumbers(num) * oddNumbers(num);
    }

    public static int evenNumbers(int evenNum){
        String nembersToString = Integer.toString(evenNum);
        int [] arrays = Arrays.stream(nembersToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i : arrays) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return  sum;
    }

    public static int oddNumbers(int oddNum){
        String nembersToString = Integer.toString(oddNum);
        int [] array = Arrays.stream(nembersToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i : array) {
            if (i % 2 != 0){
                sum += i;
            }
        }
        return  sum;
    }
}
