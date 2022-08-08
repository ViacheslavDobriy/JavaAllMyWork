package Seminars.SeminarOOP2;

/**
 * Описываем мальчика, наследуется от человека
 */
public class Boy extends Man{
    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands command) {
        if (animal instanceof Cat){
            System.out.printf("Boy say %s cat\n", command);
            switch (command){
                case KISKIS -> animal.goodAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }

        } else if (animal instanceof Dog){
            System.out.printf("Boy say %s dog\n", command);
            switch (command){
                case KISKIS -> animal.badAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }
        }
    }
}
