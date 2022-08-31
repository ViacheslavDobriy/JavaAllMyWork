package HomeWorks.HomeWork4;

public class Competition {

    public static void main(String[] args) {

        Team TEAM1 = new Team();
        Team TEAM2 = new Team();
        TEAM1.InfoTeam();
        TEAM2.InfoTeam();

        ObstacleCourse runningEasy = new Running("Easy");

        ObstacleCourse runningMedium = new Running("Medium");

        ObstacleCourse runningHard = new Running("Hard");


        System.out.printf("%s need %d power\n", runningEasy.GetObstacle(), runningEasy.GetPowerRequirements());
        System.out.printf("%s need %d power\n", runningMedium.GetObstacle(), runningMedium.GetPowerRequirements());
        System.out.printf("%s need %d power\n", runningHard.GetObstacle(), runningHard.GetPowerRequirements());

        LineOfCourses line = new LineOfCourses(runningEasy, runningMedium, runningHard);
        line.Competition(TEAM1, TEAM2);
        line.WhoIsWinner(TEAM1, TEAM2);

    }

}
