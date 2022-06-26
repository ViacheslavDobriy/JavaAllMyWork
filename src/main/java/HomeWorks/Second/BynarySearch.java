/**
 * У вас есть отсортированный массив. Сгенерировать и отсортировать его любым методом, кроме пузырька.
 * Нужно используя минимальное число попыток найти загаданное число (Алгоритм бинарного поиска)
 */

package HomeWorks.Second;

import java.math.*;
public class BynarySearch {

    public static void main(String[] args) {
    int[] generatedArray = CreateArray();
    ShowArray(generatedArray);
    generatedArray = SortArray(generatedArray);
    ShowArray(generatedArray);
    binarySearch(generatedArray, 0, generatedArray.length-1,28 );
    }

    public static int[] CreateArray() {
        int[] array = new int[(int) ((Math.random())*20)+20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random())*20)+20;
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

    public static void binarySearch(int[] arr, int first, int last, int item) {
        int position = (first+last)/2;
        int comparisonCount = 1;
        while((arr[position] > item) && (first <= last)) {
            comparisonCount++;
            if(arr[position] > item) {
                last = position -1;
            } else {
                first = position + 1;
            }
            position = (first+last)/2;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++position + " item of array");
            System.out.println("Method of binary search find number after " + comparisonCount + " comparisons");
        } else {
            System.out.println("Item was not found in array. Method of binary searching finished work after " + comparisonCount + " comparisons");
        }

    }
}
