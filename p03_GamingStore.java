package f01_BasycSyntax_MoreExersice;

import java.util.Scanner;

public class p03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double leftMoney = currentBalance;
        double spendMoney = 0;

        while (!input.equals("Game Time")){

            if(leftMoney==0){
                System.out.println("Out of money!");
                break;
            }



            if (input.equals("OutFall 4")){
                price = 39.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else {
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought OutFall 4");
                }


            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else {
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought CS: OG");
                }


            }else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else{
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought Zplinter Zell");
                }


            }else if (input.equals("Honored 2")) {
                price = 59.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else {
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought Honored 2");
                }


            }else if (input.equals("RoverWatch")) {
                price = 29.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else {
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought RoverWatch");
                }


            }else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if(price>leftMoney){
                    System.out.println("Too Expensive");
                }else {
                    spendMoney +=price;
                    leftMoney -= price;
                    System.out.println("Bought RoverWatch Origins Edition");
                }


            }else {
                System.out.println("Not Found");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, leftMoney);
    }
}
