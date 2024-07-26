package f05_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p06_ListProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String inputProduct = scanner.nextLine();

            productList.add(inputProduct);
        }


        for (int i = 0; i < number; i++) {

            Collections.sort(productList);
            System.out.println(i+1 + "." + productList.get(i));
        }

    }
}
