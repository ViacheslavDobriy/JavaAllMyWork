package HomeWorks.HomeWork4;

public abstract class Team {

    private String teamName;
    private People[] team = new People[3];

    public Team(String teamName, People[] team) {

        this.teamName = teamName;
        this.team = team;

    }

    public void InfoTeam() {

        System.out.println(teamName);
        for (int i = 0; i < team.length; i++) {

            System.out.printf("%s is %d years old and with %d power\n",team[i].GetName(), team[i].GetAge(), team[i].GetPower());
        }

    }
}
