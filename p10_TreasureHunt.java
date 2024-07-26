package f03_Arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] inputCommands = command.split(" ");
            if (command.contains("Loot")) {

                for (int i = 1; i < inputCommands.length; i++) {
                    boolean alreadyContained = false;
                    for (int j = 0; j < inputArr.length; j++) {

                        if (inputCommands[i].equals(inputArr[j])) {
                            alreadyContained = true;
                            break;
                        }

                        }
                    if (!alreadyContained) {
                        String newChest = inputCommands[i] + " " + String.join(" ", inputArr);
                        inputArr = newChest.split(" ");
                    }
                    }

                }
            if (command.contains("Drop")) {
                int index = Integer.parseInt(inputCommands[1]);

                if (index <= inputArr.length - 1 && index >= 0) {
                    String loot = inputArr[index];

                    for (int i = index; i < inputArr.length-1; i++) {
                        inputArr[i] = inputArr[i+1];
                    }

                    inputArr[inputArr.length-1] = loot;
                }
            }

            if (command.contains("Steal")) {
                int numberOfStealingItems = Integer.parseInt(inputCommands[1]);
            }

            command = scanner.nextLine();
            }


        }
    }

