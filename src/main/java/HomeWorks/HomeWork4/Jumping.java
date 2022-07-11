package HomeWorks.HomeWork4;

public class Jumping extends ObstacleCourse{
    @Override
    public String GetObstacle() {
        return "Jumping";
    }

    @Override
    public int GetPowerRequirements() {
        return 30;
    }

    @Override
    public void GoObstacle(Team team) {
        team.AfterObstacle(GetPowerRequirements());
    }
}
