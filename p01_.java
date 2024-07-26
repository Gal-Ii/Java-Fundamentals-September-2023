package f07_AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p01_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> fruitsMap = new HashMap<>();

        fruitsMap.put("apple", 1.50);
        fruitsMap.put("banana", 2.63);
        fruitsMap.put("kiwi", 2.25);

        for (Map.Entry<String, Double> entry : fruitsMap.entrySet()) {
            String currentKey = entry.getKey();
            Double currentValue = entry.getValue();

            System.out.printf("%s -> %.2f\n", currentKey,currentValue );
        }


    }
}
