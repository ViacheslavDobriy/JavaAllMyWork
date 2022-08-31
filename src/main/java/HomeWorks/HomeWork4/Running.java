package HomeWorks.HomeWork4;

public class Running extends ObstacleCourse{

    DataBase database = new DataBase();
    String complexity;
    public Running(String difficult) {

        this.complexity = difficult;

    }
    @Override
    public String GetObstacle() {
        return "Running"+complexity;
    }
    @Override
    public int GetDistance() {

        return database.GetDistance(complexity);

    }
    @Override
    public int GetPowerRequirements() {

        return database.GetDistance(complexity)/10;
    }

    @Override
    public void GoObstacle(Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }
}
