package Seminars.SeminarOOP3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan","A", 32,"man");
        Person p2 = new Person("Ivan","B", 30,"man");
        Person p3 = new Person("Ivan","C", 45,"man");
        Person p4 = new Person("Ivan","D", 28,"man");
        Person p5 = new Person("Ivan","Z", 60,"man");

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        System.out.println(persons);

//        persons.sort(new AgeComparater());

        /**
         * через анонимный класс
         */
//        persons.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.age, o2.age);
//            }
//        });
/**
 *через лямбду
 */
//        persons.sort((person1, person2)->Integer.compare(person1.age, person2.age));
/**
 * реверс
 */
//        persons.sort(new AgeComparater().reversed());

        /**
         * без явной передачи компоратора
         */


        Collections.sort(persons);


        System.out.println(persons);
    }
}
