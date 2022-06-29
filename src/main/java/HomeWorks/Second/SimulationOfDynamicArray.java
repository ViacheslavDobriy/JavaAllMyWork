/**
 * Написать метод, который будет эмулировать работу динамического массива.
 * Протестировать на выводе треугольных чисел
 */

package HomeWorks.Second;

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

    static int GetNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert integer number - i will make triangular number!");
        return iScanner.nextInt();
    }

    static int TriangularNumber(int checkedNumber){
        float floatNumber = Float.parseFloat(String.valueOf(checkedNumber));
        return (int) (floatNumber/2*(floatNumber+1));
    }

}
