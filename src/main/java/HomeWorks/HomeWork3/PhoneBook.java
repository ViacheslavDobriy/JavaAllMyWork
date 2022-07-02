/**
 * Создать Map, которая будет хранить в себе телефонные данные книги (Фамилия и телефон)
 * Если же будет появляться дубликаты, то необходимо подумать как добавлять новые номера в книгу,
 * так как если в Map уже есть данная фамилия то, старый номер сотрется.
 */

package HomeWorks.HomeWork3;

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {

    Map<String,Integer> phoneBook = new HashMap<>();
    phoneBook.put("Valov", 1111111111);
    phoneBook.put("Dobrov", 592222222);
    phoneBook.put("Filev", 255553222);
    phoneBook.put("Ogorodov", 222523222);
    phoneBook.put("Bushin", 224222222);
    while(Objects.equals(Interface(), "Yes")) {

        phoneBook = AddNewNumber(GetSurname(), phoneBook);

    }

    for (int i: phoneBook.values()) {

        System.out.println(i);

        }
    }


    public static Map<String, Integer> AddNewNumber(String surname, Map<String, Integer> phoneBook) {

            if(phoneBook.containsKey(surname)) {
                phoneBook.put(surname + GetName(), GetPhone());
            } else {
                phoneBook.put(surname, GetPhone());
            }

        return phoneBook;
    }

    public static String Interface() {
        System.out.println("Do you wanna check PhoneBook? Yes or No");
        Scanner answer = new Scanner(System.in);
        return answer.nextLine();
    }

    public static String GetSurname() {
        System.out.println("Insert surname of new person!");
        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }

    public static String GetName() {
        System.out.println("Insert name of new person!");
        Scanner line = new Scanner(System.in);
        return line.nextLine();
    }

    public static int GetPhone() {
        System.out.println("Insert phone number of new person!");
        Scanner phone = new Scanner(System.in);
        return phone.nextInt();
    }
}
