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
            team1.InfoTeam();
            team2.InfoTeam();

        }

    }
}
