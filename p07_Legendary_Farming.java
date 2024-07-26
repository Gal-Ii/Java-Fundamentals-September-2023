package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p07_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        Map<String, Integer> junksMap = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {

            String[] inputArr = scanner.nextLine().split("\\s+");

            for (int i = 0; i <= inputArr.length - 1; i += 2) {
                int quality = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1].toLowerCase();

                if(material.equals("shards")||material.equals("fragments")||material.equals("motes")){
                    int currentQuality = materialsMap.get(material);
                    materialsMap.put(material, currentQuality + quality);
                }else{
                    //junks
                    if(junksMap.containsKey(material)){
                        int currentQuality = junksMap.get(material);
                        junksMap.put(material, currentQuality + quality);
                    }else{
                        junksMap.put(material, quality);
                    }
                }
                if(materialsMap.get("shards")>=250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put(material, materialsMap.get(material) - 250);
                    isWin = true;
                    break;
                }else if(materialsMap.get("fragments")>=250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put(material, materialsMap.get(material) - 250);
                    isWin = true;
                    break;
                }else if(materialsMap.get("motes")>=250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put(material, materialsMap.get(material) - 250);
                    isWin = true;
                    break;
                }
            }

            if(isWin){
                break;
            }
        }

        //всички валидни материали -> materials
        //entry: key (материал) -> value (количество)
        materialsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        //всички боклуци -> junks
        //entry: key (боклук) -> value (количество)
        junksMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
