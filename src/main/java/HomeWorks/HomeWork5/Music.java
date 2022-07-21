package HomeWorks.HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private int[] howManyListened;
    private String[] singers;
    private String[] songs;

    private String genre;

    public Music() {

        this.singers = new String[]{"Kirkorov", "Lolita", "Pushkin", "Marlow", "Jonny", "Mot"};
        this.songs = new String[]{"Boshki Dymatsa", "Sinimi Zheltymi Krasnymi", "Highway To Hell", "Sonet", "Rayda", "Since U Been Gone", "La Grange", "My Heart", "Someday", "Shape Of You", "A cap", "Passport", "Controller", "Notebook", "Troubles", "Phone", "Ring", "Glass water", "Lemonade", "A ram zam zam", "MicroWave", "Room", "Alone", "Alies", "Table face", "Door opening", "bedroom", "Bless you", "Young and brave", "Simple", "Programming", "Summer", "poldnik", "Cause", "Sharp", "Exit", "Gift", "Defeat", "Winner", "Victory", "Quiz", "Fifa", "Telega", "Belly", "Knowledge", "AS far as i know", "Celebrate", "Person", "Dream", "English", "Disney", "Silent", "Night", "Tiger", "Amazon", "Fish", "Mac", "MC", "Fair", "Animoto", "Selfish", "Game", "Hi", "Bye", "See you", "Ghost", "Star", "War", "Yandex", "Witcher", "Loser", "End", "Sky", "Cat", "Hand", "Jewelry", "Lunch"};
        this.howManyListened = new int[songs.length];
        for (int i = 0; i < songs.length; i++) {

            this.howManyListened[i] = (int) (Math.random() * 1001);
        }
    }

    public Music(String genre, String[] singers, String[] songs, int[] listened) {

        this.genre = genre;
        this.singers = singers;
        this.songs = songs;
        this.howManyListened = listened;

    }

    public String[] GetAllSongs() {

        return songs;

    }

    public String[] GetAllSingers() {

        return singers;

    }

    public int[] GetListened() {

        return howManyListened;
    }

    public void ShowMusic () {

        System.out.println(this.genre);
        for (int i = 0; i < songs.length; i++) {

            System.out.printf("%s - singer; %s - name of song; %d - numbers of auditions\n", singers[i], songs[i], howManyListened[i]);

        }
    }

    public void RemoveUsed(int index) {

        List<String> newListSong = new ArrayList<>(songs.length - 1);
        List<Integer> newListenedList = new ArrayList<>(howManyListened.length - 1);

        for (int i = 0; i < songs.length; i++) {

            if (i != index) {

                newListSong.add(songs[i]);
                newListenedList.add(howManyListened[i]);

            }

        }

        this.howManyListened = newListenedList.stream().mapToInt(i -> i).toArray();
        this.songs = newListSong.toArray(new String[0]);

    }

    public void SortGenreList() {

        int tempListened;
        String tempSingers;
        String tempSongs;

        for (int i = 0; i < songs.length; i++) {

            int max = howManyListened[i];
            int indexMax = i;
            tempSongs = songs[i];
            tempSingers = singers[i];
            tempListened = howManyListened[i];

            for (int j = i; j < songs.length; j++) {

                if (max < howManyListened[j]) {

                    indexMax = j;
                    max = howManyListened[j];

                }
            }

            songs[i] = songs[indexMax];
            singers[i] = singers[indexMax];
            howManyListened[i] = howManyListened[indexMax];

            songs[indexMax] = tempSongs;
            singers[indexMax] = tempSingers;
            howManyListened[indexMax] = tempListened;

        }

        this.genre = this.genre + " - sorted by audition";

    }

}
