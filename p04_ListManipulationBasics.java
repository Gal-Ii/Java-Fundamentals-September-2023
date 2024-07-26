package f05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputCommands = scanner.nextLine();


        while (!inputCommands.equals("end")){
            String[] commandArr = inputCommands.split(" ");
            String command = commandArr[0];


            if(command.equals("Add")){
                int addNumber = Integer.parseInt(commandArr[1]);
                inputList.add(addNumber);
            } else if (command.equals("Remove")) {
                int removeNumber = Integer.parseInt(commandArr[1]);
                inputList.remove(Integer.valueOf(removeNumber));
            }else if (command.equals("RemoveAt")) {
                int indexToRemove = Integer.parseInt(commandArr[1]);
                inputList.remove(indexToRemove);
            }else if (command.equals("Insert")) {
                int number = Integer.parseInt(commandArr[1]);
                int index = Integer.parseInt(commandArr[2]);
                inputList.add(index, number);
            }
            inputCommands = scanner.nextLine();
        }

        for (int n:inputList) {
            System.out.print(n + " ");
        }


    }
}
