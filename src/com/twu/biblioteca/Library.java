package com.twu.biblioteca;
import java.util.List;
import java.util.ArrayList;


public class Library {

    private List<Book> allBooks = new ArrayList<Book>();

    public Library() {
        //this should instantiate all the Book objects - should be a query eventually
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        //Book secondBook = new Book("Miguel de Cervantes", "Don Quixote", 1605);
        allBooks.add(newBook);
        //this.allBooks.add(secondBook);

    }


    public String displayAllBooks() {
        String newDisplay = "" ;
        for (Book book : this.allBooks) {
            newDisplay = newDisplay + book.displayAllBookInfo();
        }
        return newDisplay;

    }

}
