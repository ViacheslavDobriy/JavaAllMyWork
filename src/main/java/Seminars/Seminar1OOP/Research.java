package Seminars.Seminar1OOP;

import java.util.List;
import java.util.Objects;

public class Research {

    public static void showAllRelations(String fullName, List<People> tree) {

        for (People person: tree) {

            if(Objects.equals(person.toString(), fullName)) {

                System.out.printf("%s has:\n", fullName);
                for (var item: person.getLinks().entrySet()) {
                    System.out.printf("%s %s\n", item.getKey().toString(), item.getValue().getTitle());
                }

            }
        }
    }

    public static void showChildren(String fullName, List<People> tree) {

        for (People person: tree) {

            if(Objects.equals(person.toString(), fullName)) {

                System.out.printf("Children of %s:\n", person.toString());
                for (var item: person.getLinks().entrySet()) {

                    if (Objects.equals(item.getValue().getTitle(), Categories.CHILD.getTitle())) {

                        System.out.printf("%s\n", item.getKey().toString());
                    }
                }
            }
        }
    }
}
