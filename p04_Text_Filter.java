package f08_Text_Processing;

import java.util.Scanner;

public class p04_Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banWordsArr.length; i++) {
            String banWord = banWordsArr[i];
            int banWordLength = banWord.length();

            String asterisks = repeat("*", banWordLength);

            text = text.replace(banWord, asterisks);

        }
        System.out.println(text);
    }

    public static String repeat( String repeated, int length){
        String repeatedAsterisks = "";

        for (int i = 0; i < length; i++) {

            repeatedAsterisks += "*";

        }

        return repeatedAsterisks;
    }
}
