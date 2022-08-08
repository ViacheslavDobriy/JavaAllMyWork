package Seminars.SeminarOOP2;

/**
 * Описываем девочку, наследуется от человека
 */
public class Girl extends Man{
    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands command) {
        if (animal instanceof Cat){
            System.out.printf("Girl say %s cat\n", command);
            switch (command){
                case KISKIS -> animal.goodAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }
        } else if (animal instanceof Dog){
            System.out.printf("Girl say %s dog\n", command);
            switch (command){
                case KISKIS -> animal.badAnswer();
                case COME -> animal.come();
                case EAT -> animal.eat();
            }
        }
    }
}
