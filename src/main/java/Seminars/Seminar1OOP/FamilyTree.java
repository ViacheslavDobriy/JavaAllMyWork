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

        People man1 = new People("John", 30);
        People man2 = new People();
        People man3 = new People("Oleg", 25);
        People man4 = new People("Slava", 7);
        Relation rel1 = new Relation(man1, man2, "child");
        Relation rel2 = new Relation(man4, man3, "parent");
        AllRelations rel = new AllRelations();
        rel.AddParentRelation(rel1);
        rel.AddParentRelation(rel2);
        rel.ShowTree();

    }
}
