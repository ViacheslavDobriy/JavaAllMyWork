package Seminars.Seminar1OOP;

public enum Categories {
    CHILD("Child"),
    BROTHER("Brother"),
    SPOUSE("Spouse"),
    UNKNOWN("Unknown"),
    MOTHER("Mother"),
    FATHER("Father"),
    ADOPTED("Adopted");

    private String title;

    Categories(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
