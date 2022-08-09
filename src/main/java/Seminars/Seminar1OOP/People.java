package Seminars.Seminar1OOP;

/**
 * Описываем класс человек
 */
public abstract class People {

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
}
