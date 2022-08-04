package Seminars.Seminar1OOP;

/**
 * Описываем связь между двумя людьми
 */
public class Relation extends AllRelations{

    private People person1;

    private People person2;

    private String relation;

    public Relation(People man1, People man2, String connection) {
        this.person1 = man1;
        this.person2 = man2;
        this.relation = connection;

    }

    public People Get1(){
        return this.person1;
    }

    public People Get2(){
        return this.person2;
    }

    public String GetRel(){
        return this.relation;
    }
//    public String WhoIsIT(People man1, People man2) {
//
//        if(man1.)
//
//    }

}
