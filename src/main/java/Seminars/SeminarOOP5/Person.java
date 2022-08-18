package Seminars.SeminarOOP5;

public abstract class Person {
    String name;
    String surname;
    int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
}
