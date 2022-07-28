package HomeWorks.HomeWork4;

import java.util.Scanner;

public class Competition {

    public static void main(String[] args) {

        RegistrationTeamForm formForTeams = new RegistrationTeamForm();
        People[] forTeam1 = new People[formForTeams.howManyMembers()];
        for (int i = 0; i < forTeam1.length; i++) {

            forTeam1[i] = new People();

        }

        People[] forTeam2 = new People[formForTeams.howManyMembers()];
        for (int i = 0; i < forTeam2.length; i++) {

            forTeam2[i] = new People();

        }


        for (People people : forTeam1) {

            people.ShowInfo();

        }
        for (People people : forTeam2) {

            people.ShowInfo();

        }
        Team TEAM1 = new Team(formForTeams.NameOfTeam(), forTeam1);
        Team TEAM2 = new Team(formForTeams.NameOfTeam(), forTeam2);
        TEAM1.InfoTeam();
        TEAM2.InfoTeam();
//
//        ObstacleCourse running = new Running();
//
//        ObstacleCourse swimming = new Swimming();
//
//        ObstacleCourse jumping = new Jumping();
//
//
//        System.out.printf("%s need %d power\n", running.GetObstacle(), running.GetPowerRequirements());
//        System.out.printf("%s need %d power\n", swimming.GetObstacle(), swimming.GetPowerRequirements());
//        System.out.printf("%s need %d power\n", jumping.GetObstacle(), jumping.GetPowerRequirements());
//
//        LineOfCourses line = new LineOfCourses(running, swimming, jumping);
//        line.Competition(team1, team2);
//        line.WhoIsWinner(team1, team2);

    }

}
