/**
 * Что такое map
 * map состоит из key и value - типо словаря из Питона
 * можно положить map в map
 * В map не может быть двух одинаковых ключей, предыдущий заменится следующим
 */
package Seminars.Seminar3;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        Map<String, Integer> collect = new HashMap<>();

        collect.put("Hello", 25);
        collect.put("Hello1", 21);
        collect.put("Hello2", 22);
        collect.put("Hello3", 24);
    }
}
