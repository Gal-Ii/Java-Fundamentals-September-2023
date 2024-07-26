package f08_Text_Processig_More_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_Treasure_Finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        String input = scanner.nextLine();

        while (!input.contains("find")) {
            String message = "";
            int keyCounter = 0;

            for (int i = 0; i < input.length(); i++) {

                char symbol = input.charAt(i);
                int asciiNumberOfSymbol = (int) symbol;

                int key = numbersArr[keyCounter];
                keyCounter++;
                if (keyCounter == numbersArr.length) {
                    keyCounter = 0;
                }

                int decryptSymbol = asciiNumberOfSymbol - key;
                char decryptedChar = (char) decryptSymbol;
                String decryptedLetter = String.valueOf(decryptedChar);
                message += decryptedLetter;
            }

            String type = message.substring(message.indexOf("&")+1, message.lastIndexOf("&"));
            String coordinates = message.substring(message.indexOf("<")+1, message.indexOf(">"));;

            System.out.printf("Found %s at %s\n", type, coordinates);

            input = scanner.nextLine();
        }


    }


}
