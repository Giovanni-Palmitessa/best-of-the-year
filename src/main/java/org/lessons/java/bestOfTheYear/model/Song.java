package org.lessons.java.bestOfTheYear.model;

public class Song {
    // Attributi
    private String id;
    private String title;

    // Costruttori
    public Song(String id, String title) {
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
