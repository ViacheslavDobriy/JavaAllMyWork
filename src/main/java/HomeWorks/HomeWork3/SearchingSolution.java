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
        String[] replacement = FirstReplacement(positions);
        System.out.println(Arrays.toString(positions)); // чтобы посмотреть на каких позициях в строке знаки вопроса
        System.out.println(Solution(add, positions,replacement));
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
        iterator = iterator+1;
        for(int i = iterator; !Objects.equals(numbers[i], "="); i++) {

            number2 = number2 + numbers[i];
            iterator++;

        }
        int intNumber2 = Integer.parseInt(number2);
        String number3 = "";
        iterator = iterator+1;
        for (int i = iterator; i < numbers.length ; i++) {

            number3 = number3 + numbers[i];

        }
        int intNumber3 = Integer.parseInt(number3);
        if(intNumber1 + intNumber2 == intNumber3) {
            System.out.println("All is fine");
            return Arrays.toString(numbers); // здесь подозреваю функция не возвращает из-за рекурсии
        } else {

            String[] newCount = CreateCountRecursion(count, count.length);
            if(!Objects.equals(newCount[0], "s")) {
                Solution(numbers, positions, newCount);
            } else {
                return "There is no solution"; // этот return тоже не работает, даже если решений очевидно нет
            }

        }
    return Arrays.toString(numbers).replace("[", "").replace("]", "").replace(",", "");
    }

    public static String[] FirstReplacement(String[] replacements) {

        String result = "";
        for (int i = 0; i < replacements.length; i++) {
            result += "0";
        }
        return result.split("");
    }
    public static String[] CreateCountRecursion(String[] oldCount, int lengthCount) {
        if(lengthCount != 0) {
            if (Objects.equals(oldCount[lengthCount - 1], "9")) {
                if (lengthCount != 1) {
                    oldCount[lengthCount - 1] = "0";
                    CreateCountRecursion(oldCount, lengthCount - 1);
                } else {
                    return "stop".split("");
                }
            } else {
                oldCount[lengthCount - 1] = Integer.parseInt(oldCount[lengthCount - 1]) + 1 + "";
            }
        }
        return oldCount;
    }

    public static String[] unknownPosition (String[] line) {

        int count = 0;
        for (int i = 0; i < line.length; i++) {
            if (Objects.equals(line[i], "?")) {
                count++;
            }
        }

        String[] positions = new String[count];
        int iterator = 0;
        for (int i = 0; i < line.length; i++) {
            if (Objects.equals(line[i], "?")) {
                positions[iterator] = i + "";
                iterator++;
            }
        }
        return positions;
    }
    public static String GetExpression() {

        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }
}
