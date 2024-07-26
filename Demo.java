package f05_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<String> inputList = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());


        for (int i = 0; i < inputList.size(); i++) {

        }
    }
}
