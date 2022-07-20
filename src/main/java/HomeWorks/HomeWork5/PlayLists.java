package HomeWorks.HomeWork5;

public class PlayLists {

    public static void main(String[] args) {

        Genre allMusic = new Genre();
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("HipHop")));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("Pop")));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("Rock")));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("Relax")));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("Classic")));
        System.out.println("-------------------------------------");
        allMusic.ShowGenre(allMusic.SortGenreList(allMusic.getGenreList("House")));

    }
}
