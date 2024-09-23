package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numCopies, String author, int yearPublished) {
        super(id, title, numCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + getTitle() + " by " + getAuthor() + " published in " + getYearPublished());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in journal paper: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out journal paper: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding journal paper: " + getTitle());
    }
}