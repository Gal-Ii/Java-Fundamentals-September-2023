package f04_Methods;

import java.util.Scanner;

public class p07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedString(input, repeat));
    }

    public static String repeatedString(String text, int times){
        String fullText = "";
        for (int i = 1; i <= times; i++) {
            fullText = fullText + text;
        }

        return fullText;
    }
}
