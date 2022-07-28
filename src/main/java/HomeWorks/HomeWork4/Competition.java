package HomeWorks.HomeWork4;

import java.util.Scanner;

public class Competition {

    public static void main(String[] args) {

        System.out.println("Creating people for filling teams, how many people there will compete?");
        Scanner line = new Scanner(System.in);
        People[] allPeople = new People[(line.nextInt())];

        for (int i = 0; i < allPeople.length; i++) {

            allPeople[i] = new People();

        }

        for (int i = 0; i < allPeople.length; i++) {

            allPeople[i].ShowInfo();

        }
//        Team team1 = new Team("Cool Team", new People[]{sportsmen1, sportsmen2, sportsmen3}) {};
//        Team team2 = new Team("Brave guys", new People[]{sportsmen4, sportsmen5, sportsmen6}) {};
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
