/**
 * Написать программу перебора n комбинаций из цифр от 0 до 9, где n - длина массива.
 */
package Seminars.Seminar3;
import java.util.*;

public class Enumeration {

    static List<List<Integer>> generateList = new ArrayList<>();

    public static void main(String[] args) {

        generateArray(new int[GetNumber()],0,9 );
    }

    public static int GetNumber() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Insert size of array: ");
            return in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Try again!");
            GetNumber();
        }
        return 0;
    }

    public static void generateArray (int[] comb, int index, int n) {
        if(comb.length == index) {
            System.out.println(Arrays.toString(comb));
        }
        for (int i = 0; i < n; i++) {
            comb[index] = 1;
            generateArray(comb, index+1, n);
        }
    }

}
