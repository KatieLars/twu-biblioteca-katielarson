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

    public Boolean isBookAvailableForCheckOut(String userInput) {
        //returns true if book is in library and is not checked out
        //will be checked out.
        for (Book book : this.allBooks) {
            if (book.title.equals(userInput) && !book.isCheckedOut) {
                book.checkOut();
                return true;
            }
        }
        return false;
    }

    public String messageBookIsUnavailable(String userInput) {
        if (!this.isBookAvailableForCheckOut(userInput)) {
            //System.out.println("Sorry, this book is not available");
            return "Sorry, that book is not available";
        }
        return "Oops! This shouldn't be available";
    }

    public Boolean canBookBeCheckedIn(String userInput) { //checks if book is either in
        for (Book book : this.allBooks) {
            if (book.title.equals(userInput) && book.isCheckedOut) { //book is in library and is checked out
                book.returnBook();
                return true;
            }
        }
        return false;
    }

    public String messageBookCannotBeReturned(String userInput) {
        if(!canBookBeCheckedIn(userInput)) {
            //System.out.println("Sorry, this book is not available");
            return "That is not a valid book to return.";
        }
        return "Oops! This should be able to be returned";
    }

}
