package f08_Text_Processig_More_Exercise;

import java.util.Scanner;

public class p02_Ascii_Sumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        int asciiFirstSymbol = (int) firstSymbol;
        char secondSymbol = scanner.nextLine().charAt(0);
        int asciiSecondSymbol = (int) secondSymbol;
        String input = scanner.nextLine();

        int sum = 0;

        StringBuilder builder = new StringBuilder(input);

        for (int i = 0; i < builder.length(); i++) {
            char symbol = builder.charAt(i);
            int asciiNumberOfSymbol = (int) symbol;

            if (asciiNumberOfSymbol > asciiFirstSymbol && asciiNumberOfSymbol < asciiSecondSymbol) {
                sum += asciiNumberOfSymbol;
            }
        }
        System.out.println(sum);
    }
}
