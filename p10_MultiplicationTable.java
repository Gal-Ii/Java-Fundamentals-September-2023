package f01_BasycSyntax;

import java.util.Scanner;

public class p10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i <=10 ; i++) {
            int result = num*i;
            System.out.printf("%d X %d = %d\n", num, i, result);
        }

        if(multiplier>10){
            int result = num*multiplier;
            System.out.printf("%d X %d = %d\n", num, multiplier, result);
        }
    }
}
