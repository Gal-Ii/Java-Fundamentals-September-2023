package f06_Object_And_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04_Song {

    static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song (String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

List<Song> listSong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputSongArr = scanner.nextLine().split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSong.add(currentSong);
        }
        String command = scanner.nextLine();

        if(command.equals("all")){
            for (Song items:listSong) {
                System.out.println(items.getName());
            }
        } else {
            for (Song items:listSong) {
                if(items.getTypeList().equals(command)){
                    System.out.println(items.getName());
                }
            }
        }


    }
}
