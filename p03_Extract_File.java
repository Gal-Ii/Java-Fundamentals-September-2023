package f08_Text_Processing_Exercise;

import java.util.Scanner;

public class p03_Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        C:\Internal\training-internal\Template.pptx

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");
        String fileName =  inputArr[inputArr.length-1];

        String[] fileNameArr = fileName.split("\\.");

        String file = fileNameArr[0];
        String extension = fileNameArr[1];

        System.out.printf("File name: %s\n", file);
        System.out.printf("File extension: %s", extension);
    }
}
