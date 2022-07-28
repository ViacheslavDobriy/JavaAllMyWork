package HomeWorks.HomeWork4;

public abstract class ObstacleCourse {

    private String nameOfObstacle;
    private int powerRequirements;
    public String SetObstacle() {
        return nameOfObstacle;
    }
    public int SetPowerRequirements() {
        return powerRequirements;
    }
    public abstract String GetObstacle();
    public abstract int GetPowerRequirements();

    public abstract void GoObstacle(Team team);
}
