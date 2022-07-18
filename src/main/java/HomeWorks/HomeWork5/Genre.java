package HomeWorks.HomeWork5;

public class Genre {

    private String name;
    private Music playList;

    public Genre() {

        this.name = "Default";
        this.playList = new Music();
    }

    public Music getPlayList(String userInput) {

        this.name = userInput;
        System.out.printf("%s - name of genre\n",name);
        for (int j = 0; j < 12; j++) {

            int randomIndex = (int) (Math.random()* playList.GetAllSongs().length);
            System.out.printf("%s %s %d \n",playList.GetAllSingers()[(int) (Math.random()* playList.GetAllSingers().length)],playList.GetAllSongs()[randomIndex], playList.GetListened().get(randomIndex));
            playList.RemoveUsedSongs(randomIndex);

            }
        return playList;
    }

//    public void ShowPlayList(){
//
//    }
}
