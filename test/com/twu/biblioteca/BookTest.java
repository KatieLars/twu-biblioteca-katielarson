package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BookTest {

    @Test
    public void shouldHaveAuthor() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.author, is("Charles Baudelaire"));
    }

    @Test
    public void shouldHavePublicationDate() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.publicationDate, is(1876));
    }

    @Test
    public void shouldHaveTitle() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.title, is("Les Fleurs du Mal"));
    }

    @Test
    public void shouldDisplayBookInfo() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.displayAllBookInfo(), is("Charles Baudelaire Les Fleurs du Mal 1876 | "));
    }

}

