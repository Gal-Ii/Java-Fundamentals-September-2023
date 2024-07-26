package f05_List_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> inputList = Arrays.stream(input.split(""))
                .collect(Collectors.toList());

        List<String> textList = new ArrayList<>();
        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            char c = input.charAt(i);
            int asciiNumberOfElement = (int) c;

            if ((asciiNumberOfElement > 64 && asciiNumberOfElement < 91) || (asciiNumberOfElement > 96 && asciiNumberOfElement < 123)) {
                textList.add(inputList.get(i));
            } else if (asciiNumberOfElement > 47 && asciiNumberOfElement < 58) {
                numsList.add(Integer.parseInt(inputList.get(i)));
            }
        }
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < numsList.size(); i++) {
            int digit = numsList.get(i);



            if (i % 2 == 0) {
                evenList.add(numsList.get(i));

            } else {
                oddList.add(numsList.get(i));
            }
        }

        List<String> messageList = new ArrayList<>();
        String letterForAdding = "";
        for (int i = 0; i < textList.size(); i++) {
            int evenRotationPerWord = evenList.get(i);
            for (int j = 0; j < evenRotationPerWord; j++) {
                letterForAdding = textList.get(i);
                messageList.add(letterForAdding);
            }
            System.out.println();
        }

        for (String s : textList) {
            System.out.print(s);
        }
        System.out.println();
        for (int n : numsList) {
            System.out.print(n);
        }


    }
}
