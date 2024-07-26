package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p02_Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstWord = input[0];
        String secondWord = input[1];


        int multiplication = 0;
        int sum = 0;
        if(firstWord.length()>secondWord.length()){
            for (int i = 0; i < secondWord.length(); i++) {
                char firstWordSymbol = firstWord.charAt(i);
                char secondWordSymbol = secondWord.charAt(i);

                multiplication = firstWordSymbol * secondWordSymbol;
                sum = sum + multiplication;
            }
            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                char firstWordSymbol = firstWord.charAt(i);
                sum += firstWordSymbol;
            }
        } else {
            for (int i = 0; i < firstWord.length(); i++) {
                char firstWordSymbol = firstWord.charAt(i);
                char secondWordSymbol = secondWord.charAt(i);

                multiplication = firstWordSymbol * secondWordSymbol;
                sum = sum + multiplication;
            }
            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                char secondWordSymbol = secondWord.charAt(i);
                sum += secondWordSymbol;
            }
        }

        System.out.println(sum);
    }
}
