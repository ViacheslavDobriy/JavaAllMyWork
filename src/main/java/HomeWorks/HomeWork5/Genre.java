package HomeWorks.HomeWork5;

public class Genre {

    private String name;
    private Song[] listSongs = new Song[11];

    public Genre(String userInput) {

        this.name = userInput;
        for (int i = 0; i < listSongs.length; i++) {
            this.listSongs[i] = new Song();
        }

    }


    public void ShowGenre() {

        for (int i = 0; i < listSongs.length; i++) {
            System.out.printf("%s %s %d\n", listSongs[i].GetNameOfSong(), listSongs[i].GetNameOfSinger(), listSongs[i].GetListened());
        }

    }


    public void SortGenre(){
        for (int i = 0; i < listSongs.length; i++) {
            Song maxListened = listSongs[i];
            Song temp;
            int placeOfMaxListened = i;
            for (int j = i; j < listSongs.length; j++) {
                if (maxListened.GetListened() < listSongs[j].GetListened() ) {
                    maxListened = listSongs[j];
                    placeOfMaxListened = j;
                }
            }
            temp = listSongs[i];
            listSongs[i] = maxListened;
            listSongs[placeOfMaxListened] = temp;

        }
        System.out.println("SORT IS DONE");
    }


    public void ShowNameOfGenre() {
        System.out.printf("%s \n",this.name);
    }

}
