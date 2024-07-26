package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p08_Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> courseNameMap = new LinkedHashMap<>();

        int counter = 0;

        while (!input.contains("End")) {

            String[] inputArr = input.split(" -> ");
            String courseName = inputArr[0];
            String studentName = inputArr[1];

            if (!courseNameMap.containsKey(courseName)) {
                courseNameMap.put(courseName, new ArrayList<String>());
            }
List<String> existingIdList = courseNameMap.get(courseName);
           if(!existingIdList.contains(studentName)){
               courseNameMap.get(courseName).add(studentName);
           }

            counter++;

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseNameMap.entrySet()) {
            System.out.printf("%s\n", entry.getKey());

            for (String s : entry.getValue()) {
                System.out.printf("-- %s\n", s);
            }
        }

    }
}
