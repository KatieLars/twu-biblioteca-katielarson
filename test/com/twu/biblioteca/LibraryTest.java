package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LibraryTest {
    @Test
    public void shouldGetAllBooksInLibrary() { //displays all books in library
        Library library = new Library();
        assertThat(library.displayAllBooks(), is("Charles Baudelaire Les Fleurs du Mal 1876 | Miguel de Cervantes Don Quixote 1605 | "));
    }

    @Test
    public void doesNotDisplayCheckedOutBooks() {
        Library newLibrary = new Library();
        assertThat(newLibrary.displayAvailableBooks(), is("Charles Baudelaire Les Fleurs du Mal 1876 | "));
    }

    @Test
    public void findsAvailableRequestedBook() {
        String userInput = "Les Fleurs du Mal";
        Library newLibrary = new Library();
        assertThat(newLibrary.displayAllBooks(), containsString(userInput));
    }

    @Test
    public void cannotFindUnavailableBook() {
        //if the user enters an invalid answer, returns a message
        String userInput = "La Peste";
        Library newLibrary = new Library();


    }
}
