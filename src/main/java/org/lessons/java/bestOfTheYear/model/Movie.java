package org.lessons.java.bestOfTheYear.model;

public class Movie {
    // Attributi
    private int id;
    private String title;

    // Costruttori
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Movie() {
    }
    // Getter

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
