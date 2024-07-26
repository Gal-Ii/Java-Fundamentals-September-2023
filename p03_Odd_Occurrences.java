package f07_AssociativeArrays;

import java.util.*;

public class p03_Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordOccurrence = new LinkedHashMap<>();

        for (int i=0; i< wordsArr.length; i++) {
            String word = wordsArr[i].toLowerCase(Locale.ROOT);

            if (!wordOccurrence.containsKey(word)) {
                wordOccurrence.put(word, 0);
            }

            int wordCount = wordOccurrence.get(word);
            wordOccurrence.put(word, wordCount + 1);
        }

        List<String> wordsForPrint = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordOccurrence.entrySet()) {
            if(entry.getValue() % 2 != 0){
                wordsForPrint.add(entry.getKey());
            }
        }

            System.out.println(String.join(", ", wordsForPrint));
    }
}
