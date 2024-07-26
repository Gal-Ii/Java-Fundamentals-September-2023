package f04_Methods;

import java.util.Scanner;

public class p02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        correspondingGrade(grade);
    }

    public static void correspondingGrade(double number) {

        String nameGrade = "";
        if (number < 3) {
            nameGrade = "Fail";
        } else if (number < 3.5) {
            nameGrade = "Poor";
        } else if (number < 4.5) {
            nameGrade = "Good";
        } else if (number < 5.5) {
            nameGrade = "Very good";
        } else if (number <= 6) {
            nameGrade = "Excellent";
        }

        System.out.println(nameGrade);
    }
}
