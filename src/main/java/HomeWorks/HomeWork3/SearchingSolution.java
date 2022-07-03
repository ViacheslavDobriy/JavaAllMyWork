/**
 * Задано уравнение вида q + w = e, где q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
 * например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
 * решение или сообщить что его нет.
 */

package HomeWorks.HomeWork3;

import java.util.*;


public class SearchingSolution {

    public static void main(String[] args) {

//        String expression = GetExpression();
//        expression = expression.replace(" ", "");
//        String[] add = expression.split("");
//        System.out.println(unknownPosition(add));
        int[] first = ToArray("2?4", 2);
        int[] second = ToArray("32?",1);
        int[] result = ToArray("5?6",2);
        System.out.println(Solution(first, second, result, 0));
    }

    public static int[] ToArray (String number, int pos) {
        int[] numberPos = new int[2];
        numberPos[0] = Integer.parseInt(number.replace("?","0"));
        numberPos[1] = pos;
        return numberPos;
    }

    public static String Solution (int[] first, int[] second, int[] result, int maxDigit) {

            if(first[0] + second[0] == result[0]) {
                System.out.printf("%d + %d = %d\n", first[0], second[0], result[0]);
            } else {
                double x = (result[0]-506)/Math.pow(10,result[1]-1);
                int y = (int) x;
                System.out.println(y);
                if (y==9) {
                    maxDigit = 0;
                    System.out.println("result = 9");
                    if (second[0] / Math.pow(10, result[1]) == 9) {
                        maxDigit = 0;
                        System.out.println("result = 9");
                        if (first[0] / Math.pow(10, result[1]) == 9) {
                            return "This expression don't have solution";
                        } else {
                            if (maxDigit == 0) {
                                first[0] = first[0] + (maxDigit + 1) * 10;
                                Solution(first, second, result, maxDigit + 1);
                            } else {
                                first[0] = first[0] - maxDigit * 10 + (maxDigit + 1) * 10;
                                Solution(first, second, result, maxDigit + 1);
                            }
                        }
                    } else {
                        if (maxDigit == 0) {
                            second[0] = second[0] + (maxDigit + 1) * 10;
                            Solution(first, second, result, maxDigit + 1);
                        } else {
                            second[0] = second[0] - maxDigit * 10 + (maxDigit + 1) * 10;
                            Solution(first, second, result, maxDigit + 1);
                        }
                    }
                }else {
//                    System.out.println("last else");
                    if (maxDigit == 0) {
                        result[0] = result[0] + (maxDigit+1)*10;
                        Solution(first, second, result, maxDigit+1);
                    } else {
                        result[0] = result[0] - maxDigit * 10 + (maxDigit + 1) * 10;
                        Solution(first, second, result, maxDigit + 1);
                    }
                }
            }
        return "Success";
    }

    public static String unknownPosition (String[] line) {
        String positions = "";
        int current = 1;
        for (int i = line.length-1; i >= 0; i--) {
            if (!Objects.equals(line[i], "=")) {
                if (!Objects.equals(line[i], "+")) {

                    if (Objects.equals(line[i], "?")) {
                        positions = positions + current;
                    }
                } else {
                    positions = positions + "-";
                    current = 0;
                }
            } else {
                positions = positions + "-";
                current = 0;
            }
            current++;
        }
        return positions;
    }
    public static String GetExpression() {

        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }
}
