package f05_List_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> messageList = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        int sum = 0;
        List<String> newMessage = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {

            int numberToCalculate = numbersList.get(i);
            String buffer = Integer.toString(numberToCalculate);
            int len = buffer.length();


            for (int j = 0; j < len; j++) {

                int numToRemove = numberToCalculate % 10;
                int numToDelete = numberToCalculate / 10;
                sum += numToRemove;

                numberToCalculate = numToDelete;
            }
            if (sum > messageList.size()) {
                int messageLength = sum - messageList.size();
                String symbol = messageList.get(messageLength);
                newMessage.add(symbol);
                messageList.remove(messageList.get(messageLength));
            } else {
                String symbol = messageList.get(sum);
                newMessage.add(symbol);
                messageList.remove(messageList.get(sum));
            }

            sum = 0;

        }

        for (String p : newMessage) {
            System.out.print(p);
        }

    }
}
