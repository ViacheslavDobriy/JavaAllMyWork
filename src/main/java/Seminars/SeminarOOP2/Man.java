package Seminars.SeminarOOP2;

/**
 * Описываем модель человека
 */
public abstract class Man implements action{

    protected String name;

    protected int age;
    protected Commands command;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public abstract void call(Animal animal, Commands command);
}
