package HomeWorks.HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Genre {

    private String name;
    private Music genreListSongs;

    public Genre() {

        this.name = "Default";
        this.genreListSongs = new Music();
    }

    public Music getGenreList(String userInput) {

        List<Integer> newListened = new ArrayList<>(12);
        String[] newSingers = new String[12];
        String[] newSongs = new String[12];

        for (int i = 0; i < newSingers.length; i++) {

            int random = (int) (Math.random()*genreListSongs.GetAllSongs().length);
            newSongs[i] = genreListSongs.GetAllSongs()[random];

            newSingers[i] = genreListSongs.GetAllSingers()[(int) (Math.random()*genreListSongs.GetAllSingers().length)];

            newListened.add(genreListSongs.GetListened().get(i));
            genreListSongs.RemoveUsed(random);
        }
        this.name = userInput;
        return new Music(newSingers, newSongs, newListened);
    }

    public Music SortGenreList(Music noSortedList) {

        List<Integer> newListened = new ArrayList<>(noSortedList.GetListened().size());
        String[] newSingers = new String[noSortedList.GetAllSingers().length];
        String[] newSongs = new String[noSortedList.GetAllSongs().length];

        for (int i = 0; i < noSortedList.GetAllSongs().length; i++) {

            int max = noSortedList.GetListened().get(i);
            int indexMax = i;

            for (int j = i; j < noSortedList.GetAllSongs().length; j++) {

                if (max < noSortedList.GetListened().get(j)) {

                    indexMax = j;
                    max = noSortedList.GetListened().get(j);

                }
            }
            newSingers[i] = noSortedList.GetAllSingers()[indexMax];
            newSongs[i] = noSortedList.GetAllSongs()[indexMax];
            newListened.add(noSortedList.GetListened().get(indexMax));
            noSortedList.RemoveAllUsed(indexMax);

        }
        return new Music(newSingers, newSongs, newListened);
    }

    public void ShowGenre(Music genre) {

        System.out.println(this.name);
        for (int i = 0; i < genre.GetAllSingers().length; i++) {

            System.out.printf("%s %s %d\n", genre.GetAllSingers()[i], genre.GetAllSongs()[i], genre.GetListened().get(i));

        }
    }
}
