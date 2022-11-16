package be.intecbrussel.LambdaTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        Person person1 = new Person("Joanne", "Rowling", LocalDate.of(1967, 7, 31));
        Person person2 = new Person("Gillian", "Flynn", LocalDate.of(1971,2, 24));
        Person person3 = new Person("Stephen", "King", LocalDate.of(1947, 9, 21));
        Person person4 = new Person("George Raymond", "Martin", LocalDate.of(1948, 9, 20));
        Person person5 = new Person("Paolo", "Coelho", LocalDate.of(1947, 8, 24));
        Book book1 = new Book("The Casual Vacancy", person1, LocalDate.of(2012,9, 27),  "Tragicomedy");
        Book book2 = new Book("Gone Girl", person2, LocalDate.of(2012,3,15), "Mystery & Thriller" );
        Book book3 = new Book("The Wind Through the Keyhole", person3, LocalDate.of(2012, 2, 21), "Fantasy");
        Book book4 = new Book("A Song of Ice and Fire", person4, LocalDate.of(1996, 8, 1), "Fantasy");
        Book book5 = new Book("The Alchemist", person5, LocalDate.of(1993, 4, 10), "Romance");

        Book [] myLibrary = {book1,book2,book3,book4,book5};

        Stream.of(myLibrary)
                .sorted(Comparator.comparing(Book::getRealeaseDate))
                .forEach(b -> {System.out.println(b.getRealeaseDate());});




    }

    public static Book getNewestBook(Book [] books) {

        return ;
    }

}

