package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p02_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resourcesMap.containsKey(resource)){
                resourcesMap.put(resource, 0);
            }

            int value = resourcesMap.get(resource);
            resourcesMap.put(resource, value + quantity);

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
