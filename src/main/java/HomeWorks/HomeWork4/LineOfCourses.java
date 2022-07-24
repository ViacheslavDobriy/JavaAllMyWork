package HomeWorks.HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class LineOfCourses {

    public LineOfCourses(ObstacleCourse running, ObstacleCourse swimming, ObstacleCourse jumping) {

        List<ObstacleCourse> courses = new ArrayList<>();
        courses.add(running);
        courses.add(swimming);
        courses.add(jumping);
        System.out.println("Obstacle of courses is ready for competition");
//        Competition(team1, team2, courses);

    }

    public void Competition(Team team1, Team team2, List<ObstacleCourse> allCourses) {

        for (int i = 0; i < allCourses.size(); i++) {

            allCourses.get(i).GoObstacle(team1);
            allCourses.get(i).GoObstacle(team2);
            team1.InfoTeam();
            team2.InfoTeam();

        }

    }
}
