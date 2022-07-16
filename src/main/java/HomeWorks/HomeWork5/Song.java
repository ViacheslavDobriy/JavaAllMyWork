package HomeWorks.HomeWork5;

public class Song {

    private String name;
    private String singer;
    private int HowManyListened;

    private Song () {
        this.name = "Work";
        this.singer = "Beyonce";
        this.HowManyListened = (int) (Math.random()*1001);
    }
    public Song (String songName, String singerName, int listened) {
        this.name = songName;
        this.singer = singerName;
        this.HowManyListened = listened;
    }
}
