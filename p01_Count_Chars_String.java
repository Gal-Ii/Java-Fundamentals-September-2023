package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p01_Count_Chars_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> lettersMap = new LinkedHashMap<>();

        for (Character ch: input.toCharArray()) {

            if (ch == ' ') {
                continue;
            }

            if(!lettersMap.containsKey(ch)){
                lettersMap.put(ch, 0);
            }
            int value = lettersMap.get(ch);
            lettersMap.put(ch, value + 1);
        }


        for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }



    }
}
