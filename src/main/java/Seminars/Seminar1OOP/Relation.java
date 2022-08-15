package Seminars.Seminar1OOP;

/**
 * Описываем связь между двумя людьми
 */
public class Relation extends AllRelations{

    private People person1;

    private People person2;

    private Categories category;

    public Relation(People man1, People man2, String connection){
        this.person1 = man1;
        this.person2 = man2;
        switch (connection) {
            case "Parent" -> appropriateCategoryParent(man2);
            case "Child" -> appropriateCategoryChild(man1, man2);
            case "Adopted" -> appropriateCategoryAdopted(man1, man2);
            case "Brother" -> this.category = Categories.BROTHER;
            case "Spouse" -> appropriateCategorySpouse(man1, man2);
        }

    }

    public People get1(){
        return this.person1;
    }

    public People get2(){
        return this.person2;
    }

    public String getRel(){
        return this.category.getTitle();
    }

    public void showLink() {

        System.out.printf("%s is %s of %s\n", person2.toString(), category.getTitle(), person1.toString());

    }

    private void appropriateCategoryParent (People man) {
        if(man.getAge()>5) {
            if(man instanceof Man){
                this.category = Categories.FATHER;
            } else {
                this.category = Categories.MOTHER;
            }
        } else {
            System.out.printf("%s can not be Parent, too young age!\n", man.toString());
            this.category = Categories.UNKNOWN;
        }
    }

    private void appropriateCategoryChild (People man1, People man2) {
        if (man1.getAge() - man2.getAge() > 5) {
            this.category = Categories.CHILD;
        } else {
            System.out.printf("%s can not be Parent of %s, the age difference is too small\n", man1.toString(), man2.toString());
            this.category = Categories.UNKNOWN;
        }
    }

    private void appropriateCategoryAdopted (People man1, People man2) {
        if (man2.getAge() < 18 && man1.getAge() - man2.getAge() >= 16) {
            this.category = Categories.ADOPTED;
        } else {
            System.out.printf("%s can not be Adopted by %s, the age difference is too small\n", man1.toString(), man2.toString());
            this.category = Categories.UNKNOWN;
        }
    }
    private void appropriateCategorySpouse (People man1, People man2) {
        if(man1 instanceof Man && man2 instanceof Woman || man1 instanceof Woman && man2 instanceof Man) {
            this.category = Categories.SPOUSE;
        } else {
            System.out.printf("%s and %s can not be spouses!\n", man1.toString(), man2.toString());
            this.category = Categories.UNKNOWN;
        }
    }
}
