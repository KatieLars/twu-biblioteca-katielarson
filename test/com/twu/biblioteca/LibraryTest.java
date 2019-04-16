package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LibraryTest {
    @Test
    public void shouldGetAllBooksInLibrary() {
        //given
        Library library = new Library();
        //when
        //then
        assertThat(library.displayAllBooks(), is("Charles Baudelaire Les Fleurs du Mal 1876 | "));

    }

    public void doesNotDisplayCheckedOutBooks() {
        //checks to see if a checked out book is displayed
    }

    public void findsAvailableRequestedBook() {
        //given
        String userInput = "Les Fleurs du Mal";
        //when
        Library newLibrary = new Library();
        //then
        assertThat(newLibrary.displayAllBooks(), containsString(userInput));
        //also serves as a validation point
        //runs checkOut on Book object
    }

    public void cannotFindUnavailableBook() {
        //if the user enters an invalid answer, returns a message

    }
}
