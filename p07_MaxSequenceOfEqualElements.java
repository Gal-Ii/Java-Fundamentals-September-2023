package f03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int element = 0;
        int nextElement = 0;
        int countElements = 0;
        int totalCount = 0;


        for (int i = 0; i <= input.length-1; i++) {
            if(input[i+1] == input.length-1){
                break;
            }
            element = input[i];
            nextElement = input[i+1];

                if (element == nextElement){
                    countElements++;
                }else {
                    continue;
                }
                totalCount = countElements;
            countElements = 0;
        }

//        if(totalCount>countElements){
//
//        }else {
//
//        }
//        for (int e:elementArr) {
//            System.out.println();
//        }
        System.out.println(countElements);
        System.out.println(totalCount);
    }
}
