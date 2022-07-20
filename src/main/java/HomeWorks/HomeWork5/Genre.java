package HomeWorks.HomeWork5;


public class Genre {

    private String name;
    private Music genreListSongs;

    public Genre() {

        this.name = "Default";
        this.genreListSongs = new Music();
    }

    public Music getGenreList(String userInput) {

        int[] newListened = new int[12];
        String[] newSingers = new String[12];
        String[] newSongs = new String[12];
//        int[] randomIndexes = new int[12];

        for (int i = 0; i < newSingers.length; i++) {

            int random = (int) (Math.random()*genreListSongs.GetAllSongs().length);
//            randomIndexes[i] = random;

            newSongs[i] = genreListSongs.GetAllSongs()[random];

            newSingers[i] = genreListSongs.GetAllSingers()[(int) (Math.random()*genreListSongs.GetAllSingers().length)];

            newListened[i] = genreListSongs.GetListened()[random];

            genreListSongs.RemoveUsed(random);

        }

        this.name = userInput;
        return new Music(newSingers, newSongs, newListened);
    }

    public Music SortGenreList(Music noSortedList) {

        int tempListened;
        String tempSingers;
        String tempSongs;

        for (int i = 0; i < noSortedList.GetAllSongs().length; i++) {

            int max = noSortedList.GetListened()[i];
            int indexMax = i;
            tempSongs = noSortedList.GetAllSongs()[i];
            tempSingers = noSortedList.GetAllSingers()[i];
            tempListened = noSortedList.GetListened()[i];

            for (int j = i; j < noSortedList.GetAllSongs().length; j++) {

                if (max < noSortedList.GetListened()[j]) {

                    indexMax = j;
                    max = noSortedList.GetListened()[j];

                }
            }

            noSortedList.GetAllSongs()[i] = noSortedList.GetAllSongs()[indexMax];
            noSortedList.GetAllSingers()[i] = noSortedList.GetAllSingers()[indexMax];
            noSortedList.GetListened()[i] = noSortedList.GetListened()[indexMax];

            noSortedList.GetAllSongs()[indexMax] = tempSongs;
            noSortedList.GetAllSingers()[indexMax] = tempSingers;
            noSortedList.GetListened()[indexMax] = tempListened;

        }
        return noSortedList;
    }

    public void ShowGenre(Music genre) {

        System.out.println(this.name);
        for (int i = 0; i < genre.GetAllSingers().length; i++) {

            System.out.printf("%s %s %d\n", genre.GetAllSingers()[i], genre.GetAllSongs()[i], genre.GetListened()[i]);

        }
//        System.out.printf("%d - in music ", genreListSongs.HowManySongsHere());
//        System.out.printf("%d - in music\n", genreListSongs.HowManyListenedHere());
//        System.out.printf("%d - in playlist ", genre.HowManySongsHere());
//        System.out.printf("%d - in playlist\n", genre.HowManyListenedHere());
    }
}
