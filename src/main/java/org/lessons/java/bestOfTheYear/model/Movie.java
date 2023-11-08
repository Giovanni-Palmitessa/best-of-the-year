package org.lessons.java.bestOfTheYear.model;

public class Movie {
    // Attributi
    private String id;
    private String title;

    // Costruttori
    public Movie(String id, String title) {
        this.id = id;
        this.title = title;
    }
    // Getter

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
