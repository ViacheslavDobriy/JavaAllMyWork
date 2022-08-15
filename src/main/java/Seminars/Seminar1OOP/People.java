package Seminars.Seminar1OOP;

/**
 * Описываем класс человек
 */
public abstract class People implements Comparable<People>{

    private String name;
    private String surname;

    private int age;

    public People(String name, String surname, int howOld) {

        this.name = name;
        this.surname = surname;
        this.age = howOld;

    }

    public int getAge(){
        return this.age;
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
