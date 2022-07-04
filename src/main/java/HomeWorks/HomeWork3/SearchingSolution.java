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
        System.out.println(unknownPosition(add));
//        int[] first = ToArray("2?4", 2);
//        int[] second = ToArray("32?",1);
//        int[] result = ToArray("5?6",2);
//        System.out.println(Solution(first, second, result, 0));
    }

    public static int[] ToArray (String number, int pos) {
        int[] numberPos = new int[2];
        numberPos[0] = Integer.parseInt(number.replace("?","0"));
        numberPos[1] = pos;
        return numberPos;
    }

    public static String Solution (String[] numbers, String[] positions, String[] count) {
        for (int i = 0; i < positions.length; i++) {
            numbers[Integer.parseInt(positions[i])] = count[i];
            }
        StringBuilder countNew = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            countNew.append(count[i]);
        }
        int newCount = Integer.parseInt(String.valueOf(countNew));
        if (newCount)
        }

    }

    public static String unknownPosition (String[] line) {
        String positions = "";
        for (int i = 0; i < line.length; i++) {
            if (Objects.equals(line[i], "?")) {
                positions = positions + i;
            }
        }
        return positions;
    }
    public static String GetExpression() {

        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }
}
