package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p06_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentsGradeMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsGradeMap.putIfAbsent(name, new ArrayList<>());
            studentsGradeMap.get(name).add(grade);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsGradeMap.entrySet()) {
           ArrayList<Double> gradesList = entry.getValue();
          double average = 0;

            for (Double d:gradesList) {
                average = gradesList.stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .getAsDouble();
            }

            if(average>=4.5){
                System.out.printf("%s -> %.2f\n", entry.getKey(), average);
            }
        }
    }
}
