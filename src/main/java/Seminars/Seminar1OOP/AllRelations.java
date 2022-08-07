package Seminars.Seminar1OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Храним все связи здесь
 */
public class AllRelations {

    List<Relation> relations = new ArrayList<>();


    public void AddRelation(Relation rel1) {

        switch (rel1.GetRel()) {
            case "Child":
            case "Parent":
                ParentChild(rel1);
                break;
            case "Brother":
                BrotherRelations(rel1);
        }
    }

    private void ParentChild(Relation rel) {

        relations.add(rel);
        if (Objects.equals(rel.GetRel(),Categories.CHILD.getTitle())) {

            Relation rel2 = new Relation(rel.Get2(), rel.Get1(), "Parent");
            this.relations.add(rel2);

        } else {

            Relation rel2 = new Relation(rel.Get2(), rel.Get1(), "Child");
            this.relations.add(rel2);

        }

    }

    private void BrotherRelations(Relation rel) {

        relations.add(rel);
        Relation rel2 = new Relation(rel.Get2(), rel.Get1(), "Brother");
        relations.add(rel2);
    }
    public void ShowTree(){

        for (int i = 0; i < relations.size(); i++) {

            System.out.printf("%s is %s of %s\n", relations.get(i).Get2().GetFullName(), relations.get(i).GetRel(), relations.get(i).Get1().GetFullName());

        }

    }

    public List<Relation> getRelations() {
        return relations;
    }
}