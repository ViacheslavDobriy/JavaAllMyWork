/**
 * Задано уравнение вида q + w = e, где q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
 * например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
 * решение или сообщить что его нет.
 */

package HomeWorks.HomeWork3;

import java.util.*;


public class SearchingSolution {

    public static void main(String[] args) {

        String expression = GetExpression();
        expression = expression.replace(" ", "");
        String[] add = expression.split("");
        String[] positions = unknownPosition(add);
        System.out.println(Arrays.toString(positions));
        String countStr = "0000";
        String[] count = countStr.split("");
        System.out.println(Solution(add, positions,count));
    }


    public static String Solution (String[] numbers, String[] positions, String[] count) {

        for (int i = 0; i < positions.length; i++) {

            numbers[Integer.parseInt(positions[i])] = count[i];

            }

        String number1 = "";
        int iterator = 0;
        for(int i = 0; !Objects.equals(numbers[i], "+"); i++) {

            number1 = number1 + numbers[i];
            iterator++;

        }
        int intNumber1 = Integer.parseInt(number1);

        String number2 = "";
        iterator = iterator+2;
        for(int i = iterator; !Objects.equals(numbers[i], "="); i++) {

            number2 = number2 + numbers[i];
            iterator++;

        }
        int intNumber2 = Integer.parseInt(number2);

        String number3 = "";
        iterator = iterator+2;
        for (int i = iterator; i < numbers.length ; i++) {

            number3 = number3 + numbers[i];

        }
        int intNumber3 = Integer.parseInt(number3);

        if(intNumber1 + intNumber2 == intNumber3) {
            return Arrays.toString(numbers);
        } else {

            String[] newCount = CreateCountRecursion(count, count.length);
            Solution(numbers, positions, newCount);

        }
    return "There is no solution";
    }


    public static String[] CreateCountRecursion(String[] oldCount, int lengthCount) {
        if (Objects.equals(oldCount[lengthCount - 1], "9")) {
            oldCount[lengthCount-1] = "0";
            CreateCountRecursion(oldCount, lengthCount-1);
        } else {
            oldCount[lengthCount-1] = Integer.parseInt(oldCount[lengthCount-1])+1 + "";
        }
        return oldCount;
    }

    public static String[] unknownPosition (String[] line) {
        String positions = "";
        for (int i = 0; i < line.length; i++) {
            if (Objects.equals(line[i], "?")) {
                positions = positions + i;
            }
        }
        return positions.split("");
    }
    public static String GetExpression() {

        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }
}
