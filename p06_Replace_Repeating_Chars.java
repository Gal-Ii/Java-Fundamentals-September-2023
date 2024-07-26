package f08_Text_Processing_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p06_Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder letters = new StringBuilder(input);

        for (int i = 0; i < letters.length() - 1; i++) {

            if (letters.charAt(i) == letters.charAt(i+1)) {
                letters.deleteCharAt(i+1);
                i --;
            }
        }

        System.out.println(letters);

    }
}
