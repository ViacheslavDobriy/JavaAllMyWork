package Seminars.Seminar1OOP;

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

        People man1 = new People("John","Lee", 30, "Boy");
        People man2 = new People();
        People man3 = new People("Oleg","Lee", 25, "Boy");
        People man4 = new People("Slava","Lee", 7, "Boy");
        People man5 = new People("Liza", "Lee", 3, "Girl");
        Relation rel1 = new Relation(man1, man2, "Child");
        Relation rel2 = new Relation(man4, man3, "Parent");
        Relation rel3 = new Relation(man1, man3, "Brother");
        Relation rel4 = new Relation(man3, man5, "Child");
        AllRelations rel = new AllRelations();
        rel.addRelation(rel1);
        rel.addRelation(rel2);
        rel.addRelation(rel3);
        rel.addRelation(rel4);
        rel.showTree();   // show all links
        System.out.println("----------------------------");
        Research.showAllRelations("Oleg Lee", rel); // all links with Oleg Lee
        System.out.println("----------------------------");
        Research.showChildren("Oleg Lee", rel);  // children of Oleg Lee

    }
}
