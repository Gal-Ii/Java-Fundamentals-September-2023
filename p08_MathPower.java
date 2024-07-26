package f04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = resultPow(firstNumber, secondNumber);

        DecimalFormat dec = new DecimalFormat("0.####");

        System.out.printf(dec.format(result));
    }

    public static double resultPow(double first, double second){
        return Math.pow(first, second);
    }
}
