package f06_Object_And_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p06_Student2 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;
        private String student;

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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstName = "";
        String lastName = "";
        int age = 0;
        String town = "";

        List<Student> studentsList = new ArrayList<>();


        while (!input.equals("end")) {

            String[] inputArr = input.split(" ");

            firstName = inputArr[0];
            lastName = inputArr[1];
            age = Integer.parseInt(inputArr[2]);
            town = inputArr[3];

            Student curentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(curentStudent);

            input = scanner.nextLine();
        }

        String inputTown = scanner.nextLine();
        boolean isExist = false;

        for (Student i : studentsList) {
            if (i.getFirstName().equals(firstName) && i.getLastName().equals(lastName)) {
                i.setAge(age);
                isExist = true;
                break;
            }
        }


        if (!isExist) {
            Student student = new Student(firstName, lastName, age, town);
            studentsList.add(student);
        }

        for (Student item : studentsList) {
            if (item.getTown().equals(inputTown)) {
                System.out.printf("%s %s is %d years old\n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
