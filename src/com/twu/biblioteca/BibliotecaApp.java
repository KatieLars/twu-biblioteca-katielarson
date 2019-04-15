package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome newWelcome = new Welcome();
        newWelcome.greeting();
        Library library = new Library();

        library.displayAllBooks();
    }
}
