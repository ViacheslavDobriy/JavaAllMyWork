/**
 * Написать метод, который проверяет валидность логина и пароля(где то нужно хранить) и при помощи конструкции try-catch
 * рекурсивно принимать данные
 * Ограничить количество попыток до 6 и после 3 попытки дб сообщение о том что вы превысили количество попыток
 * и заслипить поток на некоторое время. Если попытки кончились - выйти.
 */
package HomeWorks.HomeWork3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class AttemptIsEmpty extends Exception {

    String s;
    AttemptIsEmpty(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}

public class LoginPassword {

    public static void main(String[] args) throws InterruptedException {
        String login = "Slava";
//        int password = 54321;
        int attempts = 0;
        Login(attempts, login);
    }

    public static void Login(int attempt, String login) throws InterruptedException {
        Scanner insertLogin = new Scanner(System.in);
        try {

            System.out.printf("You still have %d attempts. Insert your login - ", 6-attempt);

            if(!login.equals(insertLogin.nextLine())) {

                throw new AttemptIsEmpty("Incorrect login!");

            } else {

                System.out.println("Validation is complete");

                }
            } catch (AttemptIsEmpty x) {

            System.out.println(x.toString());
            if(attempt < 5) {

                if(attempt > 1) {

                    System.out.println("Wait 5 seconds");
                    TimeUnit.SECONDS.sleep(5);
                }

                Login(attempt + 1, login);

            }
            System.out.println("Validation is failure");

        }
    }

}
