package f07_Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Double> productMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> qualityMap = new LinkedHashMap<>();

        while (!input.contains("buy")) {
            String[] inputArr = input.split(" ");
            String product = inputArr[0];
            double price = Double.parseDouble(inputArr[1]);
            int quality = Integer.parseInt(inputArr[2]);

            if (!productMap.containsKey(product)) {
                productMap.put(product, price);
            } else {
                productMap.put(product, price);
            }

            if (!qualityMap.containsKey(product)) {
                qualityMap.put(product, quality);
            } else {
                int value = qualityMap.get(product);
                qualityMap.put(product, value + quality);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            double price = entry.getValue();
            String product = entry.getKey();
            int quality = qualityMap.get(product);

            double totalPrice = price * quality;
            System.out.printf("%s -> %.2f\n", product, totalPrice);
        }
    }
}
