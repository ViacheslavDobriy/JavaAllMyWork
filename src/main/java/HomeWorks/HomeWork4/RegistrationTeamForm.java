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

    public String NameOfCaptain() {

        System.out.println("What is Captain's name?");
        Scanner nameCaptain = new Scanner(System.in);
        return nameCaptain.nextLine();

    }

    public int HowOldCaptain() {

        System.out.println("How old is Captain?");
        Scanner ageCaptain = new Scanner(System.in);
        return ageCaptain.nextInt();

    }

}
