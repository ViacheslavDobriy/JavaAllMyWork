/**
 * Написать метод, который проверяет валидность логина и пароля(где то нужно хранить) и при помощи конструкции try-catch
 * рекурсивно принимать данные
 * Ограничить количество попыток до 6 и после 3 попытки дб сообщение о том что вы превысили количество попыток
 * и заслипить поток на некоторое время. Если попытки кончились - выйти.
 */
package HomeWorks.HomeWork3;

import java.util.ArrayList;
import java.util.List;
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
        String password = "54321";
        List<String> data = new ArrayList<>();
        data.add(login);
        data.add(password);
        data.add("login");
        data.add("password");
        int attempts = 0;
        int iterator = 0;
        Login(attempts, data, iterator);
    }

    public static void Login(int attempt, List<String> loginPassword, int i) throws InterruptedException {
        Scanner insertLogin = new Scanner(System.in);
        try {

            System.out.printf("You have %d attempts. Insert your " + loginPassword.get(i+2), 6-attempt);

            if(!loginPassword.get(i).equals(insertLogin.nextLine())) {

                throw new AttemptIsEmpty("Incorrect " + loginPassword.get(i+2) + "!");

            } else {

                System.out.println(loginPassword.get(i+2) + " is correct!");

                if(i==0) {

                    Login(attempt, loginPassword, ++i);

                    } else {

                    System.out.println("Validation is success!");

                    }
                }
            } catch (AttemptIsEmpty x) {

            System.out.println(x.toString());

            if(attempt < 5) {

                if(attempt > 1) {

                    System.out.println("Wait 5 seconds");
                    TimeUnit.SECONDS.sleep(5);
                }

                Login(attempt + 1, loginPassword, i);

            } else {
                System.out.println("Validation is failure");
            }
        }
    }

}
