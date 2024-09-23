package com.deloitte.lab4.ex3;

public abstract class Item {
    private int id;
    private String title;
    private int numCopies;

    public Item(int id, String title, int numCopies) {
        this.id = id;
        this.title = title;
        this.numCopies = numCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public abstract void print();

    public abstract void checkIn();

    public abstract void checkOut();

    public abstract void addItem();
}