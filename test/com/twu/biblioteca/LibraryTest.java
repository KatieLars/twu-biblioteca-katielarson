package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
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
        assertThat(newLibrary.displayAvailableBooks(), containsString(userInput));
    }

    @Test
    public void cannotFindUnknownBook() {
        String userInput = "La Peste";
        Library newLibrary = new Library();
        //assertThat(newLibrary.displayAvailableBooks(), not(containsString("La Peste")));
        assertThat(newLibrary.isBookInLibrary(userInput), is(false));
    }

    @Test
    public void cannotCheckOutUnavailableBook() {
        String userInput = "Don Quixote";
        Library newLibrary = new Library();
        assertThat(newLibrary.isBookAvailable(userInput), is(false));

    }

}
