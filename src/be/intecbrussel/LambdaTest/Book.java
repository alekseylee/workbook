package be.intecbrussel.LambdaTest;

import java.time.LocalDate;

public class Book{

    public String title;
    public Person author;
    public LocalDate realeaseDate;
    public String genre;

    public Book(String title, Person author, LocalDate realeaseDate, String genre) {
        this.title = title;
        this.author = author;
        this.realeaseDate = realeaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getRealeaseDate() {
        return realeaseDate;
    }

    public String getGenre() {
        return genre;
    }
}
