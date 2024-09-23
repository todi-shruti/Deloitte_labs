package com.deloitte.lab4.ex3;

public class Book extends WrittenItem {
    public Book(int id, String title, int numCopies, String author) {
        super(id, title, numCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in book: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out book: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding book: " + getTitle());
    }
}