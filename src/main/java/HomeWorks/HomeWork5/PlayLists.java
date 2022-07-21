package HomeWorks.HomeWork5;

public class PlayLists {

    public static void main(String[] args) {

        Genre allMusic = new Genre();
        String[] allGenres = new String[] {"HipHop", "Pop", "Rock", "Relax", "Classic", "House"};
        Music[] musicGenres = SortGenres(allMusic, allGenres);
        ShowGenres(musicGenres);
        SortByAuditions(musicGenres);
        ShowGenres(musicGenres);

    }

    public static Music[] SortGenres (Genre allMusic, String[] namesOfGenres) {

        Music[] newRandom = new Music[namesOfGenres.length];
        for (int i = 0; i < namesOfGenres.length; i++) {

            newRandom[i] = allMusic.getGenreList(namesOfGenres[i]);

        }
        return newRandom;
    }

    public static void ShowGenres (Music[] sortedByGenres) {

        for (int i = 0; i < sortedByGenres.length; i++) {

            sortedByGenres[i].ShowMusic();

        }

    }

    public static void SortByAuditions (Music[] noSorted) {

        for (int i = 0; i < noSorted.length; i++) {

            noSorted[i].SortGenreList();

        }

    }
}
