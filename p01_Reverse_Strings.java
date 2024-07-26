package f08_Text_Processing;

import java.util.Scanner;

public class p01_Reverse_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String reversed = "";

            for (int i = input.length()-1; i >=0 ; i--) {
                char letter = input.charAt(i);
                reversed += letter;
            }

            System.out.printf("%s = %s\n", input, reversed);

            input = scanner.nextLine();
        }


    }
}
