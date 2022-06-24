/**
 * Определить является ли строка палиндромом
 */
package Seminars.Second;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(userInsert());

    }

    public static String userInsert() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        return input.nextLine();
    }
}
