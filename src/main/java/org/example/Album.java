package org.example;

public class Album extends LibraryItem {
    protected int trackCount;

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    @Override
    public String toString() {
        return "Album: " + this.title + " by " + this.author + " (" + this.year + ") - " + this.trackCount + " tracks";
    }
}
