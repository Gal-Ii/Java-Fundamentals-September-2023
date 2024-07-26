package f05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

int rounds = inputList.size()/2;
        for (int i = 0; i < rounds; i++) {
            int firstNumber = inputList.get(i);
            int lastNumber = inputList.get(inputList.size()-1);

            int sum = firstNumber + lastNumber;
            inputList.set(i, sum);
            inputList.remove(inputList.size()-1);
        }

        for (int n:inputList) {
            System.out.print(n + " ");
        }
    }
}
