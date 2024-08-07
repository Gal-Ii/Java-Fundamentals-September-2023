package f05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> rezultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstListElement = firstList.get(i);
            int secondListElement = secondList.get(i);

            rezultList.add(firstListElement);
            rezultList.add(secondListElement);
        }
        if (firstList.size()> secondList.size()){
rezultList.addAll(firstList.subList(minSize, firstList.size()));
        } else if (secondList.size()> firstList.size()) {
            rezultList.addAll(secondList.subList(minSize, secondList.size()));
        }

        for (int n:rezultList) {
            System.out.print(n + " ");
        }

    }
}
