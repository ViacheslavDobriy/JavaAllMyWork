/**
 * У вас есть отсортированный массив. Сгенерировать и отсортировать его любым методом, кроме пузырька.
 * Нужно используя минимальное число попыток найти загаданное число (Алгоритм бинарного поиска)
 */

package HomeWorks.Second;
import java.util.Scanner;
public class BynarySearch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Make a number, from 0 till 100: ");
        int number = in.nextInt();
        int[] generatedArray = CreateArray();
        ShowArray(generatedArray);
        generatedArray = SortArray(generatedArray);
        ShowArray(generatedArray);
        binarySearch(generatedArray, 0, generatedArray.length-1,number, 1);
    }

    public static int[] CreateArray() {
        int[] array = new int[(int) ((Math.random())*40)+40];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random())*101);
        }
        return array;
    }

    public static int[] SortArray(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (;i >=0;i--) {
                if (value < array[i]) {
                    array[i+1] = array[i];
                } else {
                    break;
                }
            }
            array[i+1] = value;
        }
        return array;
    }


    public static void ShowArray(int[] array) {
        int count = 0;
        while(count < array.length) {
            System.out.printf("%d ", array[count]);
            count++;
        }
        System.out.println(" ");
    }

    public static void binarySearch(int[] arr, int first, int last, int item, int comparisonCount) {
        int position = (first + last) / 2;
        if (first > last) {
            System.out.println("Item was not founded");
            return;
        } else {
            if (arr[position] > item) {
                binarySearch(arr, first, position - 1, item, ++comparisonCount);
            } else if (arr[position] < item) {
                binarySearch(arr, position + 1, last, item, ++comparisonCount);
            } else {
                System.out.printf("%d is %d item of array and it was done on %d trying", item, ++position, comparisonCount);
            }
        }
    }
}
