package HomeWorks.HomeWork4;

public class Competition {

    public static void main(String[] args) {

        People sportsmen1 = new People(){};
        sportsmen1.SetAge();
        sportsmen1.SetPower();
        People sportsmen2 = new People("Nastya"){};
        sportsmen2.SetAge();
        sportsmen2.SetPower();
        People sportsmen3 = new People("Roman"){};
        sportsmen3.SetAge();
        sportsmen3.SetPower();
        People sportsmen4 = new People("Gleb"){};
        sportsmen4.SetAge();
        sportsmen4.SetPower();
        People sportsmen5 = new People("Sergey"){};
        sportsmen5.SetAge();
        sportsmen5.SetPower();
        People sportsmen6 = new People("Mihail"){};
        sportsmen6.SetAge();
        sportsmen6.SetPower();

        Team team1 = new Team("Cool Team", new People[]{sportsmen1, sportsmen2, sportsmen3}) {};
        Team team2 = new Team("Brave guys", new People[]{sportsmen4, sportsmen5, sportsmen6}) {};

        team1.InfoTeam();
        team2.InfoTeam();

        ObstacleCourse running = new Running();

        ObstacleCourse swimming = new Swimming();

        ObstacleCourse jumping = new Jumping();

        System.out.printf("%s need %d power\n", running.GetObstacle(), running.GetPowerRequirements());
        System.out.printf("%s need %d power\n", swimming.GetObstacle(), swimming.GetPowerRequirements());
        System.out.printf("%s need %d power\n", jumping.GetObstacle(), jumping.GetPowerRequirements());

        running.GoObstacle(team1);
        running.GoObstacle(team2);
        System.out.println("Running obstacle is done");
        swimming.GoObstacle(team1);
        swimming.GoObstacle(team2);
        System.out.println("Swimming obstacle is done");
        jumping.GoObstacle(team1);
        jumping.GoObstacle(team2);
        System.out.println("Jumping obstacle is done");

        team1.InfoTeam();
        team2.InfoTeam();

        if(team1.HowManyPoints() > team2.HowManyPoints()) {
            System.out.printf("Team %s is winner!!", team1.GetTeamName());
        } else if (team2.HowManyPoints() > team1.HowManyPoints()) {
            System.out.printf("Team %s is winner!", team2.GetTeamName());
        } else {
            System.out.println("Friendship won!");
        }

    }

}
