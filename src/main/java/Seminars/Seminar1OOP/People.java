package Seminars.Seminar1OOP;

/**
 * Описываем класс человек
 */
public class People {

    private String name;
    private String surname;

    private int age;

    private String gender;

    public People(String name, String surname, int howOld, String gender) {

        this.name = name;
        this.surname = surname;
        this.age = howOld;
        this.gender = gender;

    }

    public People() {
        this("Stas","Molotov", 6, "Man");
    }

    public int GetAge(){
        return this.age;
    }

    public String GetName() {

        return this.name;

    }
}
