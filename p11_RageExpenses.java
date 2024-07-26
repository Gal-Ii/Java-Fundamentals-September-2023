package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLostGames = Integer.parseInt(scanner.nextLine());

        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCounter = numberLostGames/2;
        int mouseCounter = numberLostGames/3;
        int keyboardsCounter = numberLostGames/6;
        int displaysCounter = numberLostGames/12;

        double totalHeadsetPrice = headsetPrice * headsetCounter;
        double totalMousePrice = mousePrice * mouseCounter;
        double totalKeyboardPrice = keyboardPrice * keyboardsCounter;
        double totalDisplayPrice = displayPrice * displaysCounter;

        double totalExpenses = totalDisplayPrice+totalKeyboardPrice+totalHeadsetPrice+totalMousePrice;

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
