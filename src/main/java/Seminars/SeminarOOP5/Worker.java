package Seminars.SeminarOOP5;

public class Worker extends Person{
    Status status;

    public Worker(String name, String surname, int yearOfBirth, Status status) {
        super(name, surname, yearOfBirth);
        this.status = status;
    }
}
