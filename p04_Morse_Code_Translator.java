package f08_Text_Processig_More_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04_Morse_Code_Translator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        String[] input = scanner.nextLine().split(" ");

        String message = "";

        for (int i = 0; i < input.length; i++) {
            int counter = 0;

            String letter = input[i];

            for (int j = 0; j < morse.length; j++) {
                String morseLetter = morse[j];
                if (letter.equals(morseLetter)) {
                    counter = j;
                    String englishLetter = english[counter];
                    message += englishLetter;
                    break;
                } else if (letter.equals("|")) {
                    message += " ";
                    break;
                }

            }
        }

        System.out.println(message.toUpperCase());
    }
}
