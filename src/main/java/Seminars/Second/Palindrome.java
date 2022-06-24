/**
 * Определить является ли строка палиндромом
 */
package Seminars.Second;
import java.util.Objects;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String currentString = userInsert();
        if(isPalindrome(currentString)) {
            System.out.printf("String %s is Palindrome", currentString);
        }
        else {
            System.out.printf("String %s is not Palindrome", currentString);
        }
    }

    public static String userInsert() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        return input.nextLine();

    }

    public static boolean isPalindrome(String str) {
        String[] array = str.split("");
        for(int i = 0; i <= array.length/2; i++) {
            if(!Objects.equals(array[i], array[array.length - 1 - i])) { return false; }
        }
        return true;
    }
}
