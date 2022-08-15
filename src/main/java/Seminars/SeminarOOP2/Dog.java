package Seminars.SeminarOOP2;

/**
 * Описываем собаку
 */
public class Dog extends Animal{

    @Override
    public void come() {
        System.out.println("Dog come to man");
    }

    @Override
    public void goodAnswer() {
        System.out.println("Gav");
    }

    @Override
    public void badAnswer() {
        System.out.println("FFFFFrrrrrr");
    }

    @Override
    public void eat() {
        if(!fullStomach) {
            System.out.println("Dog is starting to eat");
            fullStomach=true;
        } else {
            System.out.println("Dog dont move");
        }
    }
}
