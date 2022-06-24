/**
 * В заданном интервале найти наибольшее число, которое делится на сумму цифр этого числа
 * Написать метод, который будет реализовывать динамический массив
 */

package HomeWorks;

public class Task1Update {

    public static void main(String[] args) {


    }
    public static int foundNUmber(int min, int max) {

        int result = 0;
        int[] array = new int[1]; // создать метод, который принимает в себя массив, и новое число, которое нужно будет добавлять в массив, если оно удовлетворяет условию
        for (int i = min; i < max; i++) {

            int bufNum = i;
            int count = 0;
            while (bufNum >0 ) {

                count += bufNum%10;
                bufNum /= 10;

            }

            if (i % count == 0) {

                System.out.println(i);
                result = i;
            }
        }

        return result;
    }
}
