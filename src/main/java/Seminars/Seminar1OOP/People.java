package Seminars.Seminar1OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Описываем класс человек
 */
public abstract class People implements Comparable<People>{

    private String name;
    private String surname;
    private int age;
    private Map<People, Categories> links;

    public People(String name, String surname, int howOld) {

        this.name = name;
        this.surname = surname;
        this.age = howOld;
        this.links = new HashMap<>();

    }

    public int getAge(){
        return this.age;
    }

    public Map<People, Categories> getLinks() {
        return links;
    }

    public int howManyChildren() {
        int count = 0;
        for (var child: links.entrySet()) {
            if (Objects.equals(child.getValue().getTitle(), Categories.CHILD.getTitle())) {
                count++;
            }
            if (Objects.equals(child.getValue().getTitle(), Categories.ADOPTED.getTitle())) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {

        return this.name + " " + this.surname;

    }

    @Override
    public int compareTo(People o) {
        return this.age - o.age;
    }
}
