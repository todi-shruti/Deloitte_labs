package com.deloitte.lab4.ex3;

public class Lab4Ex3 {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", 5, "S");
        JournalPaper journalPaper = new JournalPaper(2, "Machine Learning", 3, "ML", 2020);
        Video video = new Video(3, "The Matrix", 10, 120, "The IronMan ", "Science Fiction", 1999);
        CD cd = new CD(4, "Black Mirror", 8, 45, "Shruti", "Rock");

        // Print out the items
        System.out.println("Items:");
        book.print();
        journalPaper.print();
        video.print();
        cd.print();

        // Check in and out some items
        System.out.println("\nChecking in and out items:");
        book.checkIn();
        journalPaper.checkOut();
        video.checkIn();
        cd.checkOut();

        // Add some items
        System.out.println("\nAdding items:");
        book.addItem();
        journalPaper.addItem();
        video.addItem();
        cd.addItem();
    }
}