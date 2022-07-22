package HomeWorks.HomeWork5;
// все комментарии к main справа от кода ----->
public class PlayLists {

    public static void main(String[] args) {

        Genre allMusic = new Genre();                                                                           // вся медиатека
        String[] allGenres = new String[] {"HipHop", "Pop", "Rock", "Relax", "Classic", "House"};               // все доступные жанры
        Music[] musicGenres = SortGenres(allMusic, allGenres);                                                  // распределение медиатеки по жанрам (рандомно)
        ShowGenres(musicGenres);                                                                                // вывод на экран всей музыки отсортированной по жанрам
        SortByAuditions(musicGenres);                                                                           // сортировка каждого жанра по количеству прослушиваний
        ShowGenres(musicGenres);                                                                                // вывод на экран всех жанров + отсортированной по прослушиваниям
        CompilationPlaylists dancePlayList = new CompilationPlaylists("Dance", musicGenres);            // компановка треков по танцевальному плэйлисту, топ 10 треков
        CompilationPlaylists sleepPlayList = new CompilationPlaylists("Sleep", musicGenres);            // компановка в плэйлист музыки для сна, топ 10 треков
        CompilationPlaylists motivPlayList = new CompilationPlaylists("Motivation", musicGenres);       // комановка в плэйлист музыки для тренировок, топ 10 треков
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
