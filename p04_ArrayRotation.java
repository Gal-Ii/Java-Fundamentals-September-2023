package f03_Arrays_Exercise;

import java.util.Scanner;

public class p04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String oldElement = input[0];
            for (int j = 0; j < input.length-1; j++) {

                input[j]=input[j+1];
            }
            input[input.length-1] = oldElement;
        }


        for (String e: input) {
            System.out.print(e+" ");
        }
    }
}
