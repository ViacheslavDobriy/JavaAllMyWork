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

        ObstacleCourse obstacle1 = new Obstacle();

        ObstacleCourse obstacle2 = new Obstacle("Swimming", 15);

        ObstacleCourse obstacle3 = new Obstacle("Walking", 10);

        System.out.printf("%s need %d power\n", obstacle1.GetObstacle(), obstacle1.GetPowerRequirements());

        obstacle1.GoObstacle(team1);
        obstacle1.GoObstacle(team2);
        System.out.println("First obstacle is done");
        obstacle2.GoObstacle(team1);
        obstacle2.GoObstacle(team2);
        System.out.println("First obstacle is done");
        obstacle3.GoObstacle(team1);
        obstacle3.GoObstacle(team2);
        System.out.println("First obstacle is done");

        team1.InfoTeam();
        team2.InfoTeam();

    }

}
