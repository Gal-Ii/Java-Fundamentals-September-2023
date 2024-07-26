package f10_Regex_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>\\d+)";

        List<String> furniture = new ArrayList<>();
        double totalExpenses = 0;



        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group(1);
                double prise = Double.parseDouble(matcher.group(2));
                int quantity = Integer.parseInt(matcher.group(3));

                furniture.add(furnitureName);

                double expensePerItem = prise * quantity;
                totalExpenses += expensePerItem;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");

        for (String s:furniture) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f", totalExpenses);
    }
}
