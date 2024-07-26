package f01_BasycSyntax_MoreExersice;

import java.util.Scanner;

public class p05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=numberOfInputs ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            int mainDigit = num % 10;
            int numberOfDigit = 0;
            while (num != 0) {
                num /= 10;
                numberOfDigit++;
            }
            int offset = (mainDigit - 2) * 3 + 1;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int index = (offset + numberOfDigit - 1);
            int letterIndex = index + 96;
            char alphabet = (char) letterIndex;
            if (index == -6) {
                System.out.print(" ");
            } else {
                System.out.print(alphabet);
            }
        }
    }
}
