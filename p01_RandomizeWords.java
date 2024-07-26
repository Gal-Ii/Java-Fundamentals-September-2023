package f06_Object_And_Classes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        Random rdm = new Random();

        for (int i = 0; i < inputArr.length; i++) {
           int indexX = rdm.nextInt(inputArr.length);
           int indexY = rdm.nextInt(inputArr.length);

           String oldWord = inputArr[indexX];
           inputArr[indexY] = inputArr[indexX];
           inputArr[indexX] = inputArr[indexY];

        }

        System.out.println(String.join(System.lineSeparator(), inputArr));
    }
}
