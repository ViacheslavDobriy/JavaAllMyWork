package Seminars.SeminarOOP4;

import java.util.Collections;

/**
 * Реализовать собственный ArrayList
 * Более сложная задача: Реализовать собственный список или двунаправленный список
 *
 * Методы, которые должны присутстовать:
 * add - добавляет элемент
 * get by index - получить элемент
 * remove by index and by element - удаляет элемент
 * set - ставит элемент в нужную позицию
 * indexOf - получить индекс элемента
 * contains - проверка наличия элемента
 * addAll - добавляет в текущий список другой список
 * removeAll - удаляет из списка все элементы другого списка
 * sort - сортировка
 * clear - очищает список
 */
public class Run {

    public static void main(String[] args) {
        MyList<String> stringList = new MyList<>(3);
        stringList.add("My");
        stringList.add(" ");
        stringList.add("first");
        stringList.add(" ");
        stringList.add("list");
        MyList<String> stringList2 = new MyList<>(3);
        stringList2.add(" ");
        stringList2.add("is");
        stringList2.add(" ");
        stringList2.add("amazing");
        stringList2.add(" ");
        System.out.println(stringList);
//        System.out.println(stringList2);
//        System.out.println(stringList.getByIndex(2));
        stringList.addAll(stringList2);
//        System.out.println(stringList);
//        stringList.removeAll(stringList2);
//        System.out.println(stringList);
        System.out.println(stringList.removeByIndex(2));
        stringList.removeByElement(" ");
        stringList.removeByElement(" ");
//        stringList.set("tut", 3);
//        System.out.println(stringList.indexOf("lis"));
//        System.out.println(stringList.contains("tu"));
        stringList.sort();
        System.out.println(stringList);

    }

}
