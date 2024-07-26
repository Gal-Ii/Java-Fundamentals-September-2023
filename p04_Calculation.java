package f04_Methods;

import java.util.Scanner;

public class p04_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstInputNumber = Integer.parseInt(scanner.nextLine());
        int secondInputNumber = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (command){
            case "add":
                result = resultAdd(firstInputNumber, secondInputNumber);
                break;
            case "multiply":
                result = resultMultiply(firstInputNumber, secondInputNumber);
                break;
            case "subtract":
                result = resultSubtract(firstInputNumber, secondInputNumber);
                break;
            case "divide":
                result = resultDivide(firstInputNumber, secondInputNumber);
                break;
        }

        System.out.println(result);
    }

    public static int resultAdd(int firstNum, int secondNum){
       return firstNum + secondNum;
    }

    public static int resultMultiply(int firstNum, int secondNum){
        return firstNum * secondNum;
    }

    public static int resultSubtract(int firstNum, int secondNum){
        return firstNum - secondNum;
    }

    public static int resultDivide(int firstNum, int secondNum){
        return firstNum / secondNum;
    }
}
