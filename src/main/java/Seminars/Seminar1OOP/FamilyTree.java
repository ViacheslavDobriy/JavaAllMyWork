package Seminars.Seminar1OOP;

import java.util.ArrayList;
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

        Relation rel1 = new Relation(man1, man2, "Adopted");
        Relation rel2 = new Relation(man4, man3, "Parent");
        Relation rel3 = new Relation(man1, man3, "Brother");
        Relation rel4 = new Relation(man3, man5, "Child");
        Relation rel5 = new Relation(man3, man6, "Spouse");
        Relation rel6 = new Relation(man6, man5, "Child");
        Relation rel7 = new Relation(man4, man6, "Parent");

        List<People> allPeople = new ArrayList<>();
        allPeople.add(man1);
        allPeople.add(man2);
        allPeople.add(man3);
        allPeople.add(man4);
        allPeople.add(man5);
        allPeople.add(man6);

        Research.showChildren("Oleg Lee", allPeople);
        System.out.println(allPeople);
        allPeople.sort(new ChildrenComparator());
        System.out.println(allPeople);

        for (People person: allPeople) {
            System.out.printf("%s has %d children\n",person.toString(), person.howManyChildren());
        }

    }
}
