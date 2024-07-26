package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p05_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNumber = scanner.nextLine().split(""); //"923847238931983192462832102"
        int secondNumber = Integer.parseInt(scanner.nextLine()); //4

        StringBuilder result = new StringBuilder(); //"3"
        int over = 0; //на ум
        String firstDigit = "";

        for (int position = firstNumber.length - 1; position >= 0; position--) {
            //'2' char -> "2" string -> 2 int
            char symbol = firstNumber[position].charAt(0);
            String sym = String.valueOf(symbol);
            int s = Integer.parseInt(sym);
            int product = s * secondNumber + over; //23


            over = product / 10;
            result.insert(0, product % 10);

        }

        System.out.printf("%s%s", over, result);

    }
}
