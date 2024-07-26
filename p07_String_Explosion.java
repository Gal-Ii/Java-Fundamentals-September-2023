package f05_Lists;

import java.util.Scanner;

public class p07_String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder manipulatedInput = new StringBuilder(input);

        int totalStrength = 0;


        for (int i = 0; i < manipulatedInput.length(); i++) {
            char symbol = manipulatedInput.charAt(i);

            if (symbol == '>') {
                int explosionStrength = Integer.parseInt(manipulatedInput.charAt(i + 1) + "");
                totalStrength += explosionStrength;
                

            } else if (symbol != '>' && totalStrength>0) {
                manipulatedInput.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(manipulatedInput);
    }
}
