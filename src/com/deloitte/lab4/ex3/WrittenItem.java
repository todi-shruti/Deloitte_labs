package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numCopies, String author) {
        super(id, title, numCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public abstract void print();

    @Override
    public abstract void checkIn();

    @Override
    public abstract void checkOut();

    @Override
    public abstract void addItem();
}