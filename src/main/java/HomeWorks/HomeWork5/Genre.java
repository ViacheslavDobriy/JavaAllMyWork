package HomeWorks.HomeWork5;

public class Genre {

    private String name;

    private String[] listGenres = new String[]{"Pop","Hip-Hop","Rap","Classic","Rock","DupStep","Relax"};
    public Genre() {

        int nameRandom = (int) (Math.random()* listGenres.length);
        this.name = this.listGenres[nameRandom];
        removeUsed(nameRandom);

    }

    public void ShowGenre() {
        System.out.println(this.name);
    }

    private void removeUsed(int randomNumber) {

        String[] newListSongs = new String[this.listGenres.length-1];
        for (int i = 0; i < newListSongs.length; i++) {
            if (i != randomNumber) {
                newListSongs[i] = this.listGenres[i];
            }
        }
        this.listGenres = newListSongs;
    }

    private String[] getListGenres(){
        return listGenres;
    }
}
