/**
 * Вывести массив всех чисел в заданном интервале, которые делятся на сумму цифр этого числа
 */

package Seminars.Second;

import java.util.Arrays;
import java.util.Scanner;

public class DivisionNumbers {

    public static void main(String[] args) {
        System.out.println("Insert minimum: ");
        String minimum = GetNumber();
        while(!CheckUserNumber(minimum)) {
            System.out.println("Error, insert correct number, supposed to be integer!");
            minimum = GetNumber();
        }
        System.out.println("Insert maximum: ");
        String maximum = GetNumber();
        while(!CheckUserNumber(maximum)) {
            System.out.println("Error, insert correct number, supposed to be integer!");
            maximum = GetNumber();
        }
        System.out.printf("%d and %d - are limits of our searching.\n", Integer.parseInt(minimum), Integer.parseInt(maximum));
        String resultString = CreateLine(Integer.parseInt(minimum), Integer.parseInt(maximum));
        int[] resultInt = ConvertStringToInt(resultString);
        ShowArrayInt(resultInt);
    }

    /**
     * Метод, который предоставляет пользователю ввести значение
     * @return - тип данных String
     */
    public static String GetNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * Метод, который проверяет, является ли введенное пользователем число типом int
     * @param number - введенное с консоли число
     * @return - true, если строка может быть преобразована в int; false, если нет.
     */
    public static boolean CheckUserNumber(String number) {
        try {
            Integer.parseInt(number);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Метод, который создает строку, в которой находятся элементы, которые удовлетворяют условию задачи
     * @param min - нижняя граница поиска
     * @param max - верхняя граница поиска
     * @return - возвращает строку с необходимыми значениями
     */
    public static String CreateLine(int min, int max) {
        int[] fullArray = new int[max-min+1];
        for(int i = 0; i < fullArray.length; i++) {
            fullArray[i] = min + i;
        }
        String result = "";
        for(int k = 0; k < fullArray.length; k++) {
            if(fullArray[k]%LookingFor(fullArray[k])==0) {
                result = result + fullArray[k] + " ";
            }
        }
        return result;
    }

    /**
     * Метод, который складывает цифры внутри числа
     * @param number - элемент массива, полученный из метода CreateLine()
     * @return - возвращает сумму цифр элемента массива
     */
    public static int LookingFor(int number) {
        float floatNumber = (float) number;
        int sumOfDigits = 0;
        while(floatNumber/10>=1) {
            sumOfDigits = sumOfDigits + (int) floatNumber%10;
            floatNumber /= 10;
        }
        sumOfDigits = sumOfDigits + (int) floatNumber;
        return sumOfDigits;
    }

    /**
     * Метод, который конвертирует результирующую строку в массив целочисленных значений
     * @param str - полученная строка из метода CreateLine()
     * @return - возвращает int[] из параметра.
     */
    public static int[] ConvertStringToInt(String str) {
        String[] resultArray;
        resultArray = str.split(" ");
        String[] items = Arrays.toString(resultArray).replaceAll("\\[","").replaceAll("\\]", "").replaceAll("\\s","").split(",");
        int[] results = new int[items.length];
        for(int i = 0; i < items.length; i++) {
            results[i] = Integer.parseInt(items[i]);
        }
        return results;
    }

    /**
     * Метод, который выводит на экран элементы массива
     * @param array - результирующий массив
     */
    public static void ShowArrayInt(int[] array) {
        int count = 0;
        while(count < array.length) {
            System.out.printf("%d ", array[count]);
            count++;
        }
    }
}
