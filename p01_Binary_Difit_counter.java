package f09_Bitwise_operations;

import java.util.Scanner;

public class p01_Binary_Difit_counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int zeroOrOne = Integer.parseInt(scanner.nextLine());

        int counter = 0;    // брояч на 0 и 1


        while (digit > 0){
            int leftOver = digit % 2;
            digit = digit / 2;

            if(leftOver == zeroOrOne){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
