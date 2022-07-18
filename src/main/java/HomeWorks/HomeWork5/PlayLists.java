package HomeWorks.HomeWork5;

public class PlayLists {

    public static void main(String[] args) {

        Genre allMusic = new Genre();
        allMusic.ShowGenre(allMusic.getGenreList("HipHop"));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.getGenreList("Pop"));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.getGenreList("Relax"));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.getGenreList("Classic"));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.getGenreList("House"));

    }
}
