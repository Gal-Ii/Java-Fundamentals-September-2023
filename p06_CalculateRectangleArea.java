package f04_Methods;

import java.util.Scanner;

public class p06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

        System.out.println(aresCalculation(sideA, sideB));
    }

    public static int aresCalculation(int firstSide, int secondSide) {
        return firstSide * secondSide;
    }
}
