package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p01_Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sh, too_long_username, !lleg@l ch@rs, jeffbutt

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {
            //проверка дали е валидно -> print
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }
    public  static boolean isValidUsername(String username){

            if (username.length() < 3 || username.length() > 16) {
                return false;
            }

            for (int i = 0; i < username.length(); i++) {
                char symbol = username.charAt(i);

                if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                    return false;
                }
            }
        return true;

    }
}
