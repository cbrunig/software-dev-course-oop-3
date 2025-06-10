package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + this.title + " by " + this.author + " (" + this.year + ") - " + this.pageCount + " pages";
    }

    public void readBook() {
        System.out.println("Reading " + this.title + " by " + this.author + "...");
        System.out.println("Done!");
    }
}
