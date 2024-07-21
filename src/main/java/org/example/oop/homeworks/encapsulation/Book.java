package org.example.oop.homeworks.encapsulation;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private int publicationYear;

    public Book() {
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.isEmpty()) {
            System.err.println("Title cannot be empty!");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.isEmpty()) {
            System.err.println("Author name cannot be empty!");
        } else {
            this.author = author;
        }
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear <= 0 || publicationYear > LocalDate.now().getYear()) {
            System.err.println("Publication year cannot be a negative number or cannot be from the future!");
        } else {
            this.publicationYear = publicationYear;
        }
    }
}
