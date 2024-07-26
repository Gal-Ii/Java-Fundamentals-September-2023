package f03_Arrays;

import java.util.Scanner;

public class p01_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] dayOfWeeks = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if(input>=1 &&input<=7){
            System.out.println(dayOfWeeks[input-1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
