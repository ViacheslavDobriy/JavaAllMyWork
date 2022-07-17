package HomeWorks.HomeWork5;

public class Music {
    public static void main(String[] args) {

        Genre hipHop = new Genre("HipHop");
        hipHop.ShowNameOfGenre();
        hipHop.ShowGenre();
        hipHop.SortGenre();
        hipHop.ShowGenre();

        Genre pop = new Genre("Pop");
        pop.ShowNameOfGenre();
        pop.ShowGenre();
        pop.SortGenre();
        pop.ShowGenre();
    }
}
