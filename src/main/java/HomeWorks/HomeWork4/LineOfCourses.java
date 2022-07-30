package HomeWorks.HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class LineOfCourses {

    List<ObstacleCourse> courses = new ArrayList<>(3);
    public LineOfCourses(ObstacleCourse running, ObstacleCourse swimming, ObstacleCourse jumping) {

        this.courses.add(running);
        this.courses.add(swimming);
        this.courses.add(jumping);
        System.out.println("Obstacle of courses is ready for competition");

    }

    public void Competition(Team team1, Team team2) {

        for (int i = 0; i < courses.size(); i++) {

            courses.get(i).GoObstacle(team1);
            courses.get(i).GoObstacle(team2);

        }
        team1.InfoTeam();
        team2.InfoTeam();

    }

    public void WhoIsWinner(Team team1, Team team2) {

        int pointsTeam1 = 0;
        int pointsTeam2 = 0;

        for (int i = 0; i < team1.getTeam().length; i++) {

            if (team1.getTeam()[i].GetPower() >= team2.getTeam()[i].GetPower()) {

                pointsTeam1 = pointsTeam1 + 1;

            } else {

                pointsTeam2 = pointsTeam2 + 1;

            }
        }
        if (pointsTeam1 > pointsTeam2) {

            System.out.printf("Team %s is winner with %d points", team1.GetTeamName(), pointsTeam1);

        } else if (pointsTeam1 < pointsTeam2) {

            System.out.printf("Team %s is winner with %d points", team2.GetTeamName(), pointsTeam2);

        } else {

            System.out.printf("Teams took first place with %d points", pointsTeam2);

        }
    }
}
