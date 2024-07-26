package f08_Text_Processing;

import java.util.Scanner;

public class p03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ice
//kicegiciceeb

        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

//        int index = text.indexOf(wordToRemove);   //намираме на кой идекс е първото срещане на думата
//
//        while (index != -1){  //върти цикъла, докато {index = text.indexOf(wordToRemove);} не върне -1
//            text = text.replace(wordToRemove, "");   //от целия текст премахва текста на индекса
//            index = text.indexOf(wordToRemove);   //отново търси има ли съвпадение на търсената дума
//        }


        while (text.contains(wordToRemove)){
            text = text.replace(wordToRemove, "");
        }
        System.out.println(text);
    }
}
