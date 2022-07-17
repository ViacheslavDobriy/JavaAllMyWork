package HomeWorks.HomeWork5;

public class Song {

    private String name;
    private String singer;
    private int HowManyListened;

    private String[] singers = new String[]{"Kirkorov", "Lolita", "Pushkin", "Marlow", "Jonny", "Mot"};

    private String[] songs = new String[]{"Boshki Dymyatsa","Sinimi Zheltymi Krasnymi","Highway To Hell","Sonet","Rayda","Since U Been Gone","La Grange","My Heart","Someday","Shape Of You","A cap","Passport","Controller","Notebook","Troubles","Phone","Ring","Glass water","Lemonade","A ram zam zam","MicroWave","Room","Alone","Alies","Table face","Door opening","bedroom","Bless you","Young and brave","Simple","Programming", "Summer", "poldnik", "Cause", "Sharp", "Exit", "Gift", "Defeat", "Winner", "Victory", "Quiz", "Fifa", "Telega", "Belly", "Knowledge", "AS far as i know", "Celebrate", "Person", "Dream", "English", "Disney", "Silent", "Night", "Tiger", "Amazon", "Fish", "Mac", "MC", "Fair", "Animoto", "Selfish", "Game", "Hi", "Bye", "See you", "Ghost", "Star", "War", "Yandex", "Witcher", "Loser", "End", "Sky", "Cat", "Hand", "Jewelry", "Lunch"};
    public Song() {

        int nameRandom = (int) (Math.random()* songs.length);
        this.name = this.songs[nameRandom];
        this.singer = this.singers[(int) (Math.random()* singers.length)];
        this.HowManyListened = (int) (Math.random()*1001);
        removeUsed(nameRandom);

    }
    public Song (String songName, String singerName, int listened) {
        this.name = songName;
        this.singer = singerName;
        this.HowManyListened = listened;
    }

    public void showSong() {

        System.out.printf("%s - %s, %d many times listened\n", this.name, this.singer, this.HowManyListened);
    }

    private void removeUsed (int numberRandom) {
        String[] newListSongs = new String[this.songs.length-1];
        for (int i = 0; i < newListSongs.length; i++) {
            if (i != numberRandom) {
                newListSongs[i] = this.songs[i];
            }
        }
        this.songs = newListSongs;
    }
}
