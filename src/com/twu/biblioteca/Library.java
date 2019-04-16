package com.twu.biblioteca;
import java.util.List;
import java.util.ArrayList;


public class Library {

    private List<Book> allBooks = new ArrayList<Book>();

    public Library() {
        //this should instantiate all the Book objects - should be a query eventually
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        Book secondBook = new Book("Miguel de Cervantes", "Don Quixote", 1605);
        secondBook.checkOut();
        allBooks.add(newBook);
        this.allBooks.add(secondBook);
    }

    public String displayAllBooks() {
        String newDisplay = "" ;
        for (Book book : this.allBooks) {
            newDisplay = newDisplay + book.displayAllBookInfo();
        }
        return newDisplay;
    }

    public String displayAvailableBooks() {
        String newDisplay = "" ;
        for (Book book : this.allBooks) {
            if (!book.isCheckedOut) {
                newDisplay = newDisplay + book.displayAllBookInfo();
            }
        }
        return newDisplay;
    }

    public Boolean isBookAvailable(String userInput) {
        //returns true if book is in library and is not checked out
        for (Book book : this.allBooks) {
            if (book.title.equals(userInput) && !book.isCheckedOut) {
                return true;
            }
        }
        return false;
    }

    public Boolean isBookInLibrary(String userInput) {
        for (Book book : this.allBooks) {
            if (book.title.equals(userInput)) {
                return true;
            }
        }
        return false;
    }

}
