package HomeWorks.HomeWork4;

public class Team {

    private String teamName;
    private People[] team;

    private People captain;

    public Team() {

        RegistrationTeamForm newTeam = new RegistrationTeamForm();
        this.teamName = newTeam.NameOfTeam();
        this.captain = newTeam.Captain();

        People[] peopleForTeam = new People[newTeam.howManyMembers()];
        for (int i = 0; i < peopleForTeam.length; i++) {

            peopleForTeam[i] = new People("sportsmen");

        }
        this.team = peopleForTeam;
    }

    public String GetTeamName() {
        return teamName;
    }

    public void InfoTeam() {

        System.out.printf("%s - name of team, %s - captain of the team, %d - leadership skill of captain\n", teamName, captain.GetName(), captain.GetLeadership());
        for (int i = 0; i < team.length; i++) {

            System.out.printf("%s is %d years old and with %d power\n",team[i].GetName(), team[i].GetAge(), team[i].GetPower());
        }
    }

    public People[] getTeam() {
        return team;
    }

    public void AfterObstacle(int PowerRequirements) {

        for (int i = 0; i < team.length; i++) {

            team[i].DecreasePower(PowerRequirements, captain.GetLeadership()); // change captain's leadership quality

        }
    }

}
