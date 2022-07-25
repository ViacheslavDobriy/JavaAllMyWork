package HomeWorks.HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    public static void main(String[] args) {

        People sportsmen1 = new People(){};
        sportsmen1.SetAge();
        sportsmen1.SetPower();
        People sportsmen2 = new People("Nastya"){};
        sportsmen2.SetAge();
        sportsmen2.SetPower();
        People sportsmen3 = new People("Roman"){};
        sportsmen3.SetAge();
        sportsmen3.SetPower();
        People sportsmen4 = new People("Gleb"){};
        sportsmen4.SetAge();
        sportsmen4.SetPower();
        People sportsmen5 = new People("Sergey"){};
        sportsmen5.SetAge();
        sportsmen5.SetPower();
        People sportsmen6 = new People("Mihail"){};
        sportsmen6.SetAge();
        sportsmen6.SetPower();

        Team team1 = new Team("Cool Team", new People[]{sportsmen1, sportsmen2, sportsmen3}) {};
        Team team2 = new Team("Brave guys", new People[]{sportsmen4, sportsmen5, sportsmen6}) {};

        ObstacleCourse running = new Running();

        ObstacleCourse swimming = new Swimming();

        ObstacleCourse jumping = new Jumping();

        List<ObstacleCourse> courses = new ArrayList<>(3);

        courses.add(running);
        courses.add(swimming);
        courses.add(jumping);

        System.out.printf("%s need %d power\n", running.GetObstacle(), running.GetPowerRequirements());
        System.out.printf("%s need %d power\n", swimming.GetObstacle(), swimming.GetPowerRequirements());
        System.out.printf("%s need %d power\n", jumping.GetObstacle(), jumping.GetPowerRequirements());

        LineOfCourses line = new LineOfCourses(running, swimming, jumping);
        line.Competition(team1, team2);
//        if(team1.HowManyPoints() > team2.HowManyPoints()) {
//            System.out.printf("Team %s is winner!!", team1.GetTeamName());
//        } else if (team2.HowManyPoints() > team1.HowManyPoints()) {
//            System.out.printf("Team %s is winner!", team2.GetTeamName());
//        } else {
//            System.out.println("Friendship won!");
//        }

    }

}
