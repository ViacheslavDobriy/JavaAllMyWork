package Seminars.SeminarOOP3;

/**
 * описываем модель человека
 */
public class Person implements Comparable<Person>{
    public String name;
    public String surname;
    public int age;
    public String sex;

    public Person(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
