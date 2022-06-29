/**
 * Написать метод, который будет эмулировать работу динамического массива.
 * Протестировать на выводе треугольных чисел
 */

package HomeWorks.Second;

import java.util.Scanner;

public class SimulationOfDynamicArray {
    public static void main(String[] args) {

        String userNumber = GetNumber();
        if(isCorrect(userNumber)) {

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

    static String GetNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Insert integer number - i will make triangular number!");
        return iScanner.nextLine();
    }

    static boolean isCorrect(String line){
        try {
            if(Integer.parseInt(line)>0)
                return true;
        }
        catch (NumberFormatException e){
            return false;
        }
        return false;
    }

    static int TriangularNumber(String checkedNumber){
        float intNumber = Float.parseFloat(checkedNumber);
        return Math.round(intNumber/2*(intNumber+1));
    }

}
