package HomeWorks.HomeWork4;

import java.util.Scanner;

public class Obstacle extends ObstacleCourse{

    private String nameOfObstacle;
    private int powerRequirements;

    public Obstacle(String nameOfObstacle, int powerRequirements) {

        this.nameOfObstacle = nameOfObstacle;
        this.powerRequirements = powerRequirements;

    }

    public Obstacle() {

        this("Running", 20);

    }

    public void GoObstacle(Team team) {

    }

    @Override
    public int GetPowerRequirements () {
        return powerRequirements;
    }

    @Override
    public String SetObstacle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert name of obstacle");
        nameOfObstacle = input.nextLine();
        return nameOfObstacle;
    }

    @Override
    public int SetPowerRequirements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert how many power of obstacle sportsmen need to spend for this obstacle!");
        powerRequirements = input.nextInt();
        return powerRequirements;
    }

    @Override
    public String GetObstacle() {
        return nameOfObstacle;
    }
}
