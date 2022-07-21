package HomeWorks.HomeWork5;


public class Genre {
    private Music genreListSongs;

    public Genre() {

        this.genreListSongs = new Music();
    }

    public Music getGenreList(String userInput) {

        int[] newListened = new int[12];
        String[] newSingers = new String[12];
        String[] newSongs = new String[12];

        for (int i = 0; i < newSingers.length; i++) {

            int random = (int) (Math.random()*genreListSongs.GetAllSongs().length);

            newSongs[i] = genreListSongs.GetAllSongs()[random];

            newSingers[i] = genreListSongs.GetAllSingers()[(int) (Math.random()*genreListSongs.GetAllSingers().length)];

            newListened[i] = genreListSongs.GetListened()[random];

            genreListSongs.RemoveUsed(random);

        }

        return new Music(userInput, newSingers, newSongs, newListened);
    }

}
