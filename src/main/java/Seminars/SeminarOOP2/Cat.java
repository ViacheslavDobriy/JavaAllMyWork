package Seminars.SeminarOOP2;

/**
 * Описываем кота
 */
public class Cat extends Animal{


    @Override
    public void come() {
        System.out.println("Cat come to man");
    }

    @Override
    public void goodAnswer() {
        System.out.println("Meow");
    }

    @Override
    public void badAnswer() {
        System.out.println("FFFrrrrrr");
    }

    @Override
    public void eat() {
        if(!fullStomach) {
            System.out.println("Cat is starting to eat");
            fullStomach=true;
        } else {
            System.out.println("Cat dont move");
        }

    }
}
