package Seminars.Seminar1OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Храним все связи здесь
 */
public class AllRelations {

    private List<Relation> relations = new ArrayList<>();


    public void addRelation(Relation rel1) {

        switch (rel1.getRel()) {
            case "Child", "Adopted", "Mother", "Father" -> parentChild(rel1);
            case "Brother" -> brotherRelations(rel1);
            case "Spouse" -> spouseRelations(rel1);
            case "Unknown" -> System.out.printf("Link %s and %s is not created\n", rel1.get1().toString(), rel1.get2().toString());
        }
    }

    private void parentChild(Relation rel) {

        relations.add(rel);
        if (Objects.equals(rel.getRel(),Categories.CHILD.getTitle())) {

            Relation rel2 = new Relation(rel.get2(), rel.get1(), "Parent");
            this.relations.add(rel2);

        } else if (Objects.equals(rel.getRel(), Categories.ADOPTED.getTitle())){
            Relation rel2 = new Relation(rel.get2(), rel.get1(), "Parent");
            this.relations.add(rel2);
        } else {
            Relation rel2 = new Relation(rel.get2(), rel.get1(), "Child");
            this.relations.add(rel2);

        }

    }

    private void brotherRelations(Relation rel) {

        relations.add(rel);
        Relation rel2 = new Relation(rel.get2(), rel.get1(), "Brother");
        relations.add(rel2);
    }
    private void spouseRelations(Relation rel) {

        relations.add(rel);
        Relation rel2 = new Relation(rel.get2(), rel.get1(), "Spouse");
        relations.add(rel2);
    }
    public void showTree(){

        for (Relation rel: relations) {

            System.out.printf("%s is %s of %s\n", rel.get2().toString(), rel.getRel(), rel.get1().toString());

        }

    }

    public List<Relation> getRelations() {
        return relations;
    }
}