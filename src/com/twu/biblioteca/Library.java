package com.twu.biblioteca;
import java.util.List;


public class Library {

    private List<Book> allBooks;

    public Library() {
        //this should instantiate all the Book objects
    }


    public void setAllBooks() {
        //setter
//        this.allBooks = new String[]{"Don Quixote", "Les Fleurs du Mal", "War and Peace"};

    }

    public String displayAllBooks() {
        String newDisplay = "" ;
        for (Book book : this.allBooks) {
            System.out.println(book.displayAllBookInfo());
            return newDisplay + book.displayAllBookInfo();
        }
        return newDisplay;

    }

}
