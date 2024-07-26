package f10_Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06_Extract_email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = " (?<user>[A-Za-z0-9]+[\\.\\-\\_]*[A-Za-z0-9]+)@(?<host>(?<firstWord>[A-Za-z]+-?[A-Za-z]+)(?<secondWord>\\.[A-Za-z]+-?[A-Za-z]+)+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
