package HomeWorks.HomeWork4;

import java.util.Scanner;

public class Running extends ObstacleCourse{

    @Override
    public String GetObstacle() {
        return "Running";
    }

    @Override
    public int GetPowerRequirements () {
        return 20;
    }

    @Override
    public void GoObstacle(Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }

    @Override
    public String SetObstacle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert name of obstacle");
        return input.nextLine();
    }

    @Override
    public int SetPowerRequirements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert how many power of obstacle sportsmen need to spend for this obstacle!");
        return input.nextInt();
    }

}
