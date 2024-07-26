package f05_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        inputList.removeIf(e -> e<0);
        Collections.reverse(inputList);

//        for (int i = 0; i < inputList.size(); i++) {
//            if(inputList.get(i)<0){
//                inputList.remove(i);
//            }
//        }
             if(inputList.size() == 0){
                              System.out.print("empty");
             } else {
                 System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
             }
    }

}
