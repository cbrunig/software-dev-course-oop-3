package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String toString() {
        return "Item: " + this.title + " by " + this.author + "(" + this.year + ")";
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }
}

