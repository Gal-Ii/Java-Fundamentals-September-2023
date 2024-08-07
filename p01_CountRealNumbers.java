package f07_AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        for (Double num:numbersArr) {

            if(!numbersMap.containsKey(num)){
                numbersMap.put(num, 1);
            }else{
                int value = numbersMap.get(num);
                numbersMap.put(num, value + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
