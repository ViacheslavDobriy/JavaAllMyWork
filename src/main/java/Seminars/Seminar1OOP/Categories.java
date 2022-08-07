package Seminars.Seminar1OOP;

public enum Categories {
    PARENT("Parent"),
    CHILD("Child"),
    BROTHER("Brother");

    private String title;

    Categories(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
