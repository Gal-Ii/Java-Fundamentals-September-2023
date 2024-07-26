package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p04_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        for (int i = 0; i < input.length; i++) {
            char symbol = input[i].charAt(0);
            int encrypted = symbol + 3;
            char encryptedSymbol = (char)encrypted;

            System.out.print(encryptedSymbol);
        }
    }
}
