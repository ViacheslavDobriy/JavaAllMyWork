package HomeWorks.HomeWork4;

import java.util.Scanner;

/**
 * В данном классе описывается интерфейс по регистрации команд
 */
public class RegistrationTeamForm {

    public String NameOfTeam() {

        System.out.println("Insert name of your team.");
        Scanner teamName = new Scanner(System.in);
        return teamName.nextLine();

    }

    public int howManyMembers() {

        System.out.println("How many competitors in your team?");
        Scanner howManyMembers = new Scanner(System.in);
        return howManyMembers.nextInt();

    }

    public People Captain() {

        People captain = new People();
        return captain;

    }

}
