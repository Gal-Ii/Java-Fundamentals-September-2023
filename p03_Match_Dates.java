package f10_Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_Match_Dates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            String day = matcher.group(1);
            String month = matcher.group(3);
            String year = matcher.group(4);


            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
        }


    }
}
