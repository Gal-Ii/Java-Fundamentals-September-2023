package f07_AssociativeArrays;

import java.util.*;

public class p02_Words_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> wordSynonyms = new LinkedHashMap<>();
//като създаваме LinkedHashmap ни само казваме, че стойността ще е тип лист, но не го създаваме

        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordSynonyms.containsKey(word)) {
                wordSynonyms.put(word,new ArrayList<>());
//              като добавяме първата дума в асоциативният масив, саъздаваме празен лист в паметта
            }

            wordSynonyms.get(word).add(synonym);
//            с .get взимаме стойността на key word и с функцията .add която е за добавяне на информация в листове
//            добавяме и синонима към листа
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
