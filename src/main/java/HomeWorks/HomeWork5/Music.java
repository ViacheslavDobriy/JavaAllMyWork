package HomeWorks.HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private List<Integer> howManyListened = new ArrayList<>();
    private String[] genres;
    private String[] singers;

    private String[] songs;

    public Music() {

        this.genres = new String[]{"HipHop", "Pop", "Rock", "Classic", "Relax", "House"};
        this.singers = new String[]{"Kirkorov", "Lolita", "Pushkin", "Marlow", "Jonny", "Mot"};
        this.songs = new String[]{"Boshki Dymyatsa","Sinimi Zheltymi Krasnymi","Highway To Hell","Sonet","Rayda","Since U Been Gone","La Grange","My Heart","Someday","Shape Of You","A cap","Passport","Controller","Notebook","Troubles","Phone","Ring","Glass water","Lemonade","A ram zam zam","MicroWave","Room","Alone","Alies","Table face","Door opening","bedroom","Bless you","Young and brave","Simple","Programming", "Summer", "poldnik", "Cause", "Sharp", "Exit", "Gift", "Defeat", "Winner", "Victory", "Quiz", "Fifa", "Telega", "Belly", "Knowledge", "AS far as i know", "Celebrate", "Person", "Dream", "English", "Disney", "Silent", "Night", "Tiger", "Amazon", "Fish", "Mac", "MC", "Fair", "Animoto", "Selfish", "Game", "Hi", "Bye", "See you", "Ghost", "Star", "War", "Yandex", "Witcher", "Loser", "End", "Sky", "Cat", "Hand", "Jewelry", "Lunch"};
        for (int i = 0; i < songs.length; i++) {

            this.howManyListened.add((int) (Math.random()*1001));
        }
    }
    public String[] GetGenres () {

        return genres;

    }
    public String[] GetAllSongs () {

        return songs;

    }
    public String[] GetAllSingers () {

        return singers;

    }
    public List<Integer> GetListened () {

        return howManyListened;
    }

    public void RemoveUsedSongs(int index) {

        List<String> newList = new ArrayList<>(songs.length-1);
        for (int i = 0; i < songs.length; i++) {

            if (i != index) {

                newList.add(songs[i]);

            }

        }
        this.howManyListened.remove(index);
        this.songs = newList.toArray(new String[0]);
    }




    public int HowManySongsHere(){
        return this.songs.length;
    }
}