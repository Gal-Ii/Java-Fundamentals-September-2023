package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p07_String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder builder = new StringBuilder(input);

        int strength = 0;


        for (int i = 0; i < builder.length(); i++) {
            char symbol = builder.charAt(i);

            if(symbol == '>'){
                int digit = Integer.parseInt(builder.charAt(i+1) + "");
                strength += digit;

            } else if ((symbol != '>') && (strength>0)) {
                builder.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(builder);
    }
}
