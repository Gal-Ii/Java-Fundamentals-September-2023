package f05_Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size()-1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i+1);

            if (currentNum == nextNum){
                double sum = currentNum + nextNum;
                numbersList.set(i, sum);
                numbersList.remove(i+1);
                i=-1;
            }
        }

        for (Double n:numbersList) {
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.print(df.format(n) + " ");
        }
    }
}
