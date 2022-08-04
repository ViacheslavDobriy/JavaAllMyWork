package Seminars.Seminar1OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Храним все связи здесь
 */
public class AllRelations {

    List<Relation> relations = new ArrayList<>();


    public void AddParentRelation(Relation rel1) {
        relations.add(rel1);
        if (Objects.equals(rel1.GetRel(), "child")) {

            Relation rel2 = new Relation(rel1.Get2(), rel1.Get1(), "parent");
            this.relations.add(rel2);

        } else {

            Relation rel2 = new Relation(rel1.Get2(), rel1.Get1(), "child");
            this.relations.add(rel2);

        }
    }

    public void ShowTree(){

        for (int i = 0; i < relations.size(); i++) {

            System.out.printf("%s is %s of %s\n", relations.get(i).Get2().GetName(), relations.get(i).GetRel(), relations.get(i).Get1().GetName());

        }

    }
}