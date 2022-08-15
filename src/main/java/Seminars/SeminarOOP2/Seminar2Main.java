package Seminars.SeminarOOP2;
/**
Описать логику взаимодействия человека и домашнего питомца. Добавить разных животных. Добавить разные методы взаимодействия питомца и человека. Возможно добавить разных членов семьи? Нужно использовать абстрактные классы и интерфейсы.

Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.
 */
public class Seminar2Main {

    public static void main(String[] args) {

        Man slava = new Boy("Slava", 26);
        Man liza = new Girl("Liza", 30);
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        slava.call(cat1,Commands.KISKIS);
        slava.call(dog1, Commands.EAT);
        slava.call(dog1,Commands.EAT);
        System.out.println("-----------------");
        liza.call(cat1, Commands.COME);
        liza.call(dog1, Commands.KISKIS);
    }
}
