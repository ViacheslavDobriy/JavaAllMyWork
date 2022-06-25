/**
 * Сократить строку вида aaabbbssskkk до a3b3s3k3
 */
package Seminars.Second;

import java.util.Objects;

public class MakeShortString {

    public static void main(String[] args) {

        String newString = Palindrome.userInsert();
        System.out.println(newString);
        System.out.println(makeShort(newString));
    }

    public static String makeShort(String str) {

        String[] strArray = str.split("");
        String resultLine = "";
        int counter = 1;           // variable which count how long row with the same symbols.
        int count = 1;             // variable for while.
        while(count < strArray.length) {
            if(Objects.equals(strArray[count], strArray[count - 1])) {
                counter = counter+1;
            }
            else if(counter == 1) {
                resultLine = resultLine + strArray[count-1];
            }
            else {
                resultLine = resultLine + strArray[count-1] + counter;
                counter = 1;
            }
            if(count == strArray.length-1) {
                resultLine = resultLine + strArray[count] + counter;
            }
            count++;
        }
        return resultLine;
    }
}
