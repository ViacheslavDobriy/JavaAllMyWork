/**
 * У вас есть отсортированный массив. Сгенерировать и отсортировать его любым методом, кроме пузырька.
 * Нужно используя минимальное число попыток найти загаданное число (Алгоритм бинарного поиска)
 */

package HomeWorks.Second;

import java.math.*;
public class BynarySearch {

    public static void main(String[] args) {
    int[] generatedArray = CreateArray();
    }

    public static int[] CreateArray() {
        int[] array = new int[(int) ((Math.random())*100)+20];
        System.out.printf("%d - length of array", array.length);
        return array;
    }
}
