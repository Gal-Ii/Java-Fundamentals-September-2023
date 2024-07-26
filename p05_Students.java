package f06_Object_And_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p05_Students {

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");

            Student curentStudent = new Student(inputArr[0], inputArr[1], Integer.parseInt(inputArr[2]), inputArr[3]);
            studentsList.add(curentStudent);

            input = scanner.nextLine();
        }

        String inputTown = scanner.nextLine();
        for (Student item:studentsList) {
            if(item.getTown().equals(inputTown)){
                System.out.printf("%s %s is %d years old\n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
