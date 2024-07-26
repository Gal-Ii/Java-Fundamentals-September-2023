package f10_Regex_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p04_Star_Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        String regex = "[STARstar]";
        Pattern pattern = Pattern.compile(regex);

        String planet = "";
        int population = 0;
        String attackType = "";
        int soldierCount = 0;
        String type = "";
        int counterAB = 0;

        Map<String, String> planetsMap = new TreeMap<>();
        Map<String, Integer> planetsCounter = new TreeMap<>();

        List<String> attackersPlanets = new ArrayList<>(); //атакуващи планети (attackType е "А")
        List<String> destroyedPlanets = new ArrayList<>(); //унищожени планети (attackType е "D")

        for (int i = 0; i < times; i++) {

            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            String[] inputArr = input.split("");
            int counter = 0;
            while (matcher.find()) {
                int c = 1;
                counter += c;
            }

            StringBuilder builder = new StringBuilder(input);
            StringBuilder builderTwo = new StringBuilder();



            for (int j = 0; j < builder.length(); j++) {
                char symbol = builder.charAt(j);

                int newSymbol = (int) symbol - counter;

                char decryptedSymbol = (char) newSymbol;

                builderTwo.append(decryptedSymbol);
            }

            String regexDecryptedText = "[\\@](?<planet>[A-Za-z]+)[\\S]*\\:(?<population>[0-9]+)[\\S]*[\\!](?<attack>[A-Z]+)[\\S]*[->](?<solders>[0-9]+)";
            Pattern patternThree = Pattern.compile(regexDecryptedText);
            Matcher matcherThree = patternThree.matcher(builderTwo);


            while (matcherThree.find()) {
                planet = matcherThree.group(1);
                population = Integer.parseInt(matcherThree.group(2));
                attackType = matcherThree.group(3);
                soldierCount = Integer.parseInt(matcherThree.group(4));
                counterAB++;
            }

            if(attackType.equals("A")){
                attackersPlanets.add(planet);
            } else if (attackType.equals("D")){
                destroyedPlanets.add(planet);
            }
        }

        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets); //сортирам планетите по име
        attackersPlanets.forEach(p -> System.out.println("-> " + p));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets); //сортирам планетите по име
        destroyedPlanets.forEach(p -> System.out.println("-> " + p));
    }
}
