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
            case "Parent":
                this.category = Categories.PARENT;
                break;
            case "Child":
                this.category = Categories.CHILD;
                break;
            case "Brother":
                this.category = Categories.BROTHER;
                break;
        }

    }

    public People Get1(){
        return this.person1;
    }

    public People Get2(){
        return this.person2;
    }

    public String GetRel(){
        return this.category.getTitle();
    }

}
