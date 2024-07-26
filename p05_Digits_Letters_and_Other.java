package f08_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p05_Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if(Character.isDigit(symbol)){
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterSb.append(symbol);
            }else {
                otherSb.append(symbol);
            }
        }

//        String[] input = scanner.nextLine().split("");
//        List<String> digitsList = new ArrayList<>();
//        List<String> lettersList = new ArrayList<>();
//        List<String> otherList = new ArrayList<>();
//
//        for (String s : input) {
//            int valueOfSymbol = s.charAt(0);
//
//            if (valueOfSymbol >= 48 && valueOfSymbol <= 57) {
//                digitsList.add(s);
//            } else if (valueOfSymbol >= 65 && valueOfSymbol <= 90 || valueOfSymbol >= 97 && valueOfSymbol <= 122) {
//                lettersList.add(s);
//            }else{
//                otherList.add(s);
//            }
//
//        }
        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
