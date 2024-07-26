package f07_Associative_Arrays_Exercise;

import java.util.*;

public class p09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> sidesMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

           if(input.contains("|")){
               String[] inputArr = input.split(" \\| ");
               String side = inputArr[0];
               String user = inputArr[1];
               
// 1. проверявам дали имам такава страна, ако нямам си я добавям
               if(!sidesMap.containsKey(side)){
                   sidesMap.put(side, new ArrayList<>());
               }

               boolean isExist = false;

               for (List<String> list : sidesMap.values()) {
                   if (list.contains(user)) {
                       isExist = true;
                       break;
                   }
               }

               if (!isExist) {
                   sidesMap.get(side).add(user);
               }
           }else if (input.contains(" -> ")){
                String[] inputArr = input.split(" -> ");
                String side = inputArr[1];
                String user = inputArr[0];

               //1. премахваме играча ако го има в някой отбор
                sidesMap.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(user));

               //2. преместване в новия отбор
//               //2.1. има ли такъв отбор -> няма
//                if(!sidesMap.containsKey(side)){
//                   sidesMap.put(side, new ArrayList<>());
//                   sidesMap.get(side).add(user);
//
//               }
//                //2.2. има ли такъв отбор -> има
//                else {
//                    sidesMap.get(side).add(user);
//                }

               System.out.printf("%s joins the %s side!", user, side);
           }
            input = scanner.nextLine();
        }

        //print
        //премахваме отборите без играчи
        sidesMap.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {
                    //entry: key (team) -> value (list of players)
                    //"Side: {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
