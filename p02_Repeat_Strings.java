package f08_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02_Repeat_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        List<String> concatedWords = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            String word = inputArr[i];
            int numberOfLetters = word.length();

            String repeatedWordsResult = repeatedWords(word, numberOfLetters);
            concatedWords.add(repeatedWordsResult);
        }

        for (String s:concatedWords) {
            System.out.print(s);
        }
    }

    public  static String repeatedWords(String word, int length){
        String repeated = "";

        for (int j = 0; j < length; j++) {
            repeated += word;
        }

        return repeated;
    }
}
