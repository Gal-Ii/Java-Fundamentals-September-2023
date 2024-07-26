package f07_Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p04_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> usernamesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            String userName = inputArr[1];

            if (command.equals("register")) {
                String licensePlateNumber = inputArr[2];
                if(!usernamesMap.containsKey(userName)){
                    usernamesMap.putIfAbsent(userName, licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n", userName, licensePlateNumber);
                }else{
                    System.out.printf("ERROR: already registered with plate number %s\n", licensePlateNumber);
                }
            }

            if (command.equals("unregister")){
                if(!usernamesMap.containsKey(userName)){
                   System.out.printf("ERROR: user %s not found\n", userName);
                }else{
                    usernamesMap.remove(userName);
                    System.out.printf("%s unregistered successfully\n", userName);
                }
            }
        }

        for (Map.Entry<String, String> entry : usernamesMap.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }

    }
}
