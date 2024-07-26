package f08_Text_Processig_More_Exercise;

import java.util.Scanner;

public class p01_Extract_Person_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String firstLine = scanner.nextLine();


            StringBuilder builderFirstLine = new StringBuilder(firstLine);
            String name = "";
            String age = "";

            for (int j = 0; j < builderFirstLine.length(); j++) {
                int firstSymbolIndex = builderFirstLine.indexOf("@");
                int secondSymbolIndex = builderFirstLine.indexOf("|");
                int thirdSymbolIndex = builderFirstLine.indexOf("#");
                int forthSymbolIndex = builderFirstLine.indexOf("*");

                name = builderFirstLine.substring(firstSymbolIndex+1, secondSymbolIndex);
                age = builderFirstLine.substring(thirdSymbolIndex+1, forthSymbolIndex);


            }
            System.out.printf("%s is %s years old.\n", name, age);
        }

    }
}
