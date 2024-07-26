package f10_Regex_Exercise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String participants = scanner.nextLine();

        List<String> participantsList = Arrays.stream(participants.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> raceDistance = new LinkedHashMap<>();
        participantsList.forEach(participant -> raceDistance.put(participant, 0));

        String regexText = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexText);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            StringBuilder playerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()){
                playerName.append(matcherLetters.group());
            }

            int scores = 0;
            Matcher matcherDigits = patternDigit.matcher(input);
            while (matcherDigits.find()){
               scores += Integer.parseInt(matcherDigits.group());
            }

            if (raceDistance.containsKey(playerName.toString())) {
                int currentDistance = raceDistance.get(playerName.toString());
                raceDistance.put(playerName.toString(), currentDistance + scores);
            }


            input = scanner.nextLine();
        }
int count = 1;
        for (Map.Entry<String, Integer> pair : raceDistance.entrySet()) {
            if(count == 1){
                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                System.out.println("2nd place: " + pair.getKey());
                count++;
            }else if (count == 3) {
                System.out.println("3rd place: " + pair.getKey());
                break;
            }
        }

    }
}
