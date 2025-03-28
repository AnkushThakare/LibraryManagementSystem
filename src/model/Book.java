package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private String availability; // "Available" or "Checked Out"

    public Book(int id, String title, String author, String genre, String availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getAvailability() { return availability; }

    public void setAvailability(String availability) { this.availability = availability; }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + availability;
    }
}
