package f01_BasycSyntax;

import java.util.Scanner;

public class p04_BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                int hours = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                int totalSeconds = 0;

                totalSeconds = hours*60 + second + 30;
                int totalHours = totalSeconds / 60;
                int leftSeconds = totalSeconds % 60;

                if(totalHours>23){
                    totalHours = 0;
                }

                System.out.printf("%d:%02d", totalHours, leftSeconds);
            }
        }