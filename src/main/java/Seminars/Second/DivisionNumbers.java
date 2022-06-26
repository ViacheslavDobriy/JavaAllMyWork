/**
 * Вывести массив всех чисел в заданном интервале, которые делятся на сумму цифр этого числа
 */

package Seminars.Second;

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
        System.out.println(CreateArray(Integer.parseInt(minimum), Integer.parseInt(maximum)));
    }

    public static String GetNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static boolean CheckUserNumber(String number) {
        try {
            Integer.parseInt(number);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String CreateArray(int min, int max) {
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

}
