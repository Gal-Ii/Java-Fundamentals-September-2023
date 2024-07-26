package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sumOfPeople = 0;

        int[] trainArr = new int[wagons];

        for (int i = 0; i < trainArr.length; i++) {
            trainArr[i] = Integer.parseInt(scanner.nextLine());
            sumOfPeople += trainArr[i];
        }

        System.out.println(Arrays.toString(trainArr).replace("[", "").replace("]", "").replace(",", ""));
        System.out.println(sumOfPeople);

    }
}
