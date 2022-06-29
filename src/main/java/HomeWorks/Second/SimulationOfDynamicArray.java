/**
 * Написать метод, который будет эмулировать работу динамического массива.
 * Протестировать на выводе треугольных чисел
 */

package HomeWorks.Second;

public class SimulationOfDynamicArray {
    public static void main(String[] args) {

    }

    public static int[] CreateNewArray(int[] array, int newNumber) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newNumber;
        return newArray;
    }
}
