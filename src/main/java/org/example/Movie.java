package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes;

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + this.title + " by " + this.author + " (" + this.year + ") - " + this.durationInMinutes + " minutes";
    }
}
