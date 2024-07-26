package f03_Arrays;

import java.util.Scanner;

public class p04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldLetter = inputArr[i];
            inputArr[i] = inputArr[inputArr.length-1-i];
            inputArr[inputArr.length-1-i] = oldLetter;
        }

        for (String inp : inputArr) {
            System.out.printf(inp + " ");
        }

    }
}
