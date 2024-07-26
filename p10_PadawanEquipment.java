package f01_BasycSyntax_Exersice;

import java.util.Scanner;

public class p10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightsaberianNumber = Math.ceil(students + (students*0.1));

        int beltsNumber = (students-(students/6));

        double expenses = (students * robesPrice) + (beltsNumber*beltsPrice) + (lightsabersPrice*lightsaberianNumber);
        double enoughMoney = budget - expenses;
        if(expenses<=budget){
            System.out.printf("The money is enough - it would cost %.2flv.", expenses);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(enoughMoney));
        }
    }
}
