package HomeWorks.HomeWork4;

public class Swimming extends ObstacleCourse{
    @Override
    public String GetObstacle() {

        return "Swimming";

    }

    @Override
    public int GetPowerRequirements() {

        return 15;

    }

    @Override
    public int GetDistance() {
        return 0;
    }

    @Override
    public void GoObstacle (Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }
}
