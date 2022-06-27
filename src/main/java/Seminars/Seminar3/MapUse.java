/**
 * Дан список из 10-20 слов с повторами,
 * вывести этот же список без повторов и указать сколько раз оно встречалось до изменения.
 */
package Seminars.Seminar3;

import java.util.*;

public class MapUse {

    public static void main(String[] args) {
        List<String> fullList = CreateList();
        Map<String, Integer> shortList = CheckList(fullList);
        System.out.println(shortList);
    }

    public static List<String> CreateList() {

        List<String> names = new ArrayList<>();
        names.add("Slava");
        names.add("Slava");
        names.add("Mikhail");
        names.add("Mikhail");
        names.add("Mikhail");
        names.add("Anton");
        names.add("Anton");
        names.add("Vika");
        names.add("Sergey");
        names.add("Evgeniy");
        names.add("Mikhail");
        names.add("Vika");
        names.add("Vika");

        return names;

    }

    public static Map<String, Integer> CheckList(List<String> list) {
        Map<String, Integer> check = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (check.containsKey(list.get(i))) {
                check.put(list.get(i), check.get(list.get(i))+1);
            } else {
                check.put(list.get(i), 1);
            }
        }
        return check;
    }
}
