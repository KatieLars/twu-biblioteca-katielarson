package com.twu.biblioteca;

import java.lang.reflect.Array;

public class Library {

    private String[] allBooks;

    public void setAllBooks() {
        //setter
        this.allBooks = new String[]{"Don Quixote", "Les Fleurs du Mal", "War and Peace"};
    }

    public String[] getAllBooks() {
        //getter
        for (String book : this.allBooks) {
            System.out.println(book);
        }
        return this.allBooks;
    }

}
