package HomeWorks.HomeWork5;

public abstract class Genre {

    private String name;

    private Genre() {
        this.name = "Default";
    }

    public Genre(String userInput) {
        this.name = userInput;
    }
}
