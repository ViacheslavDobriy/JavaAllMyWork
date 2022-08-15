package Seminars.Seminar1OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Идея: описать некоторое количество компонент, например:
 * - модель человека
 * - компонента хранения связей и отношений между людьми:
 *   родитель, ребёнок - классика, но можно подумать и про
 *   отношение, брат, свекровь, сестра и т. д.
 * - компонент для проведения исследований
 * - дополнительные компоненты, например отвечающие за вывод
 *   данных в консоль, загрузку и сохранения в файл,
 *   получение\построение отдельных моделей человека
 *   Под “проведением исследования” можно понимать получение всех
 *   детей выбранного человека.
 */
public class FamilyTree {

    public static void main(String[] args) {

        People man1 = new Man("John","Lee", 19);
        People man2 = new Man("Vanya", "Lee", 2);
        People man3 = new Man("Oleg","Lee", 25);
        People man4 = new Man("Slava","Lee", 7);
        People man5 = new Woman("Liza", "Lee", 3);
        People man6 = new Woman("ALina", "Lee", 29);

        List<People> allPeople = new ArrayList<>();
        allPeople.add(man1);
        allPeople.add(man2);
        allPeople.add(man3);
        allPeople.add(man4);
        allPeople.add(man5);
        allPeople.add(man6);

        System.out.println(allPeople);
//        allPeople.sort((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge())); // лямбда выражение
//        Collections.sort(allPeople); // use implements Comparable. Descending order
        allPeople.sort(new AgeComparator()); // use Class AgeComparator with implementation Comparator<People>. Ascending order
        System.out.println(allPeople);
        Relation rel1 = new Relation(man1, man2, "Adopted");
        Relation rel2 = new Relation(man4, man3, "Parent");
        Relation rel3 = new Relation(man1, man3, "Brother");
        Relation rel4 = new Relation(man3, man5, "Child");
        Relation rel5 = new Relation(man3, man6, "Spouse");
        AllRelations rel = new AllRelations();
        rel.addRelation(rel1);
        rel.addRelation(rel2);
        rel.addRelation(rel3);
        rel.addRelation(rel4);
        rel.addRelation(rel5);
        rel.showTree();   // show all links
//        System.out.println("----------------------------");
//        Research.showAllRelations("Oleg Lee", rel); // all links with Oleg Lee
//        System.out.println("----------------------------");
//        Research.showChildren("Oleg Lee", rel);  // children of Oleg Lee

    }
}
