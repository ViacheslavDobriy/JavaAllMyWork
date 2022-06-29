/**
 * Написать метод, который будет эмулировать работу динамического массива.
 * Протестировать на выводе треугольных чисел
 */

package HomeWorks.Second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulationOfDynamicArray {
    public static void main(String[] args) {

        int userNumber = GetNumber();
        int[] array = new int[0];
        int count = 1;
        while(count <= userNumber) {
            array = CreateNewArray(array, TriangularNumber(count));
            ShowArray(array);
            count++;
        }
    }

    public static int[] CreateNewArray(int[] array, int newNumber) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newNumber;
        return newArray;
    }

    public static void ShowArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
        System.out.println("");
    }

    public static int GetNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your number, I will make Triangular Number!");
        try {
            return in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Try again!");
            GetNumber();
        }
        return 0;
    }

    static int TriangularNumber(int checkedNumber){
        float floatNumber = Float.parseFloat(String.valueOf(checkedNumber));
        return (int) (floatNumber/2*(floatNumber+1));
    }

}
