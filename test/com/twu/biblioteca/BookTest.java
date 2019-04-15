package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BookTest {

    @Test
    public void shouldHaveAuthor() {

        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.getAuthor(), is("Charles Baudelaire"));
    }

    @Test
    public void shouldHavePublicationDate() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.getPublicationDate(), 1876);
    }

    @Test
    public void shouldHaveTitle() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.getTitle(), 1876);
    }

    @Test
    public void shouldDisplayBookInformation() {
        //given
        //a library of books
        //when
        //a library is instantiated, books are created from the database
        //then
        //the books are displayed with column separators

    }
}

