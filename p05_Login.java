package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        String input = scanner.nextLine();

        for (int i = username.length()-1; i >= 0 ; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }
        int wrongAnswers = 0;
        while (!input.equals(password)){
                wrongAnswers ++;

                if (wrongAnswers == 4){
                    System.out.printf("User %s blocked!", username);
                   break;
                }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
            }

        if(input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
