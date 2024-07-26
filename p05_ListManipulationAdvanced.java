package f05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandArr = commands.split(" ");
            String command = commandArr[0];


            if (command.contains("Contains")) {

                int number = Integer.parseInt(commandArr[1]);
                if (inputList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }
            if (command.contains("Print")) {
                String commandTwo = commandArr[1];

                if (commandTwo.contains("even")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck % 2 == 0) {
                            System.out.printf("%d" + " ", numForCheck);
                        }
                    }
                    System.out.println();
                }
                if (commandTwo.contains("odd")) {
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck % 2 != 0) {
                            System.out.printf("%d" + " ", numForCheck);
                        }
                    }
                    System.out.println();
                }
            }
            if (command.contains("Get")) {
                int sum = 0;
                for (int i = 0; i < inputList.size(); i++) {
                    int numForSum = inputList.get(i);
                    sum += numForSum;
                }
                System.out.printf("%d" + " ", sum);
                System.out.println();
            }
            if (command.contains("Filter")) {
                String condition = commandArr[1];
                int inputNumber = Integer.parseInt(commandArr[2]);


                if(condition.equals(">=")) {
                    List<Integer> numbersList = new ArrayList<>();
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck >= inputNumber) {
                            numbersList.add(inputList.get(i));
                            }
                    }
                    for (int n:numbersList) {
                        System.out.print(n +  " ");
                    }
                    System.out.println();
                }
                if(condition.equals(">")) {
                    List<Integer> numbersList = new ArrayList<>();
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck > inputNumber) {
                            numbersList.add(inputList.get(i));
                        }
                    }
                    for (int n:numbersList) {
                        System.out.print(n +  " ");
                    }
                    System.out.println();
                }
                if(condition.equals("<=")) {
                    List<Integer> numbersList = new ArrayList<>();
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck <= inputNumber) {
                            numbersList.add(inputList.get(i));
                        }
                    }
                    for (int n:numbersList) {
                        System.out.print(n +  " ");
                    }
                    System.out.println();
                }
                if(condition.equals("<")) {
                    List<Integer> numbersList = new ArrayList<>();
                    for (int i = 0; i < inputList.size(); i++) {
                        int numForCheck = inputList.get(i);
                        if (numForCheck < inputNumber) {
                            numbersList.add(inputList.get(i));
                        }
                    }
                    for (int n:numbersList) {
                        System.out.print(n +  " ");
                    }
                    System.out.println();
                }
            }
            commands = scanner.nextLine();
        }
    }
}
