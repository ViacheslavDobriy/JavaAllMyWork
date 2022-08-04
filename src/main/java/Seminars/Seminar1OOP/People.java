package Seminars.Seminar1OOP;

/**
 * Описываем класс человек
 */
public class People {

    private String name;

    private int age;

    public People(String fullName, int howOld) {

        this.name = fullName;
        this.age = howOld;

    }

    public People() {
        this("Stas", 6);
    }

    public int GetAge(){
        return this.age;
    }

    public String GetName() {

        return this.name;

    }
}
