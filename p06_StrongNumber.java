package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digit = number;
        double factorial = 1;
int digitToCount = 0;

double totalFactorial = 0;
        while (digit>0) {
            digitToCount = digit % 10;
            for (int j = 1; j <= digitToCount; j++) {
                factorial *= j;
            }
            totalFactorial += factorial;
            factorial = 1;
            digit = digit / 10;
        }

        if(totalFactorial == number){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
