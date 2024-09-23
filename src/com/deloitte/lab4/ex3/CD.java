package com.deloitte.lab4.ex3;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numCopies, int runtime, String artist, String genre) {
        super(id, title, numCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + getTitle() + " by " + getArtist() + " (" + getGenre() + ")");
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in CD: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out CD: " + getTitle());
    }

    @Override
    public void addItem() {
        System.out.println("Adding CD: " + getTitle());
    }
}