package org.lessons.java.bestOfTheYear.model;

public class Song {
    // Attributi
    private int id;
    private String title;

    // Costruttori
    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}