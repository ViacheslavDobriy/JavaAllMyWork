package Seminars.Seminar1OOP;

import java.util.List;
import java.util.Objects;

public class Research {

    public static void showAllRelations(String fullName, AllRelations links) {

        List<Relation> relations = links.getRelations();

        for (Relation rel: relations) {

            if(Objects.equals(rel.Get2().GetFullName(), fullName)) {

                rel.showLink();

            }
        }
    }

    public static void showChildren(String fullName, AllRelations links) {

        List<Relation> relations = links.getRelations();
        System.out.printf("Children of %s\n", fullName);
        for (Relation rel: relations) {

            if(Objects.equals(rel.Get1().GetFullName(), fullName) &&
            Objects.equals(rel.GetRel(),"Child")) {

                System.out.println(rel.Get2().GetFullName());

            }
        }

    }
}
