package HomeWorks.HomeWork5;

import java.util.Objects;

public class CompilationPlaylists {

    private String name;

    public CompilationPlaylists(String userInput, Music[] sortedByGenres) {

        this.name = userInput;

        Music[] playList = new Music[2];

        if (Objects.equals(userInput, "Dance")) {

            playList = CreatePlayList(sortedByGenres, "Pop", "House");

        }

        if(Objects.equals(userInput, "Sleep")) {

            playList = CreatePlayList(sortedByGenres, "Classic", "Relax");

        }

        if (Objects.equals(userInput, "Motivation")) {

            playList = CreatePlayList(sortedByGenres , "Rock", "HipHop");

        }
        ShowPlayList(playList);
    }

    public Music[] CreatePlayList (Music[] sortedByGenres, String genre1, String genre2) {

        Music[] playList = new Music[2];

        for (Music sortedByGenre : sortedByGenres) {

            if (Objects.equals(sortedByGenre.GetGenre(), genre1)) {

                playList[0] = sortedByGenre;

            }

            if (Objects.equals(sortedByGenre.GetGenre(), genre2)) {

                playList[1] = sortedByGenre;

            }

        }

        return playList;
    }

    public void ShowPlayList(Music[] chosenGenres) {

        System.out.printf("%s Playlist\n",this.name);
        if (chosenGenres[0].GetListened()[0] > chosenGenres[1].GetListened()[0]) {

            for (int i = 0; i < 5; i++) {

                System.out.printf("%s - singer; %s - song; %d - number of auditions\n", chosenGenres[0].GetAllSingers()[i], chosenGenres[0].GetAllSongs()[i], chosenGenres[0].GetListened()[i]);
                System.out.printf("%s - singer; %s - song; %d - number of auditions\n", chosenGenres[1].GetAllSingers()[i], chosenGenres[1].GetAllSongs()[i], chosenGenres[1].GetListened()[i]);

            }

        } else {

            for (int i = 0; i < 5; i++) {

                System.out.printf("%s - singer; %s - song; %d - number of auditions\n", chosenGenres[1].GetAllSingers()[i], chosenGenres[1].GetAllSongs()[i], chosenGenres[1].GetListened()[i]);
                System.out.printf("%s - singer; %s - song; %d - number of auditions\n", chosenGenres[0].GetAllSingers()[i], chosenGenres[0].GetAllSongs()[i], chosenGenres[0].GetListened()[i]);

            }

        }

    }
}
