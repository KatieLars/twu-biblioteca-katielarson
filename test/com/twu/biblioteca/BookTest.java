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

    @Test
    public void bookIsAvailable() {
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        assertThat(newBook.isCheckedOut, is(false));
    }

    @Test
    public void customerCanCheckOutBook() {
        //given
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        //when
        newBook.checkOut();
        assertThat(newBook.isCheckedOut, is(true));
    }

    @Test
    public void shouldReceiveSuccessfulCheckOutMessage() {
        //given
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        //when
        assertThat(newBook.checkOut(), is("Thank you! Enjoy the book"));
    }

    @Test
    public void customerCanReturnBook() {
        //givem
        Book newBook = new Book("Charles Baudelaire", "Les Fleurs du Mal", 1876);
        //when
        newBook.checkOut();
        newBook.returnBook();
        assertThat(newBook.isCheckedOut, is(false));

    }

    @Test
    public void shouldReceiveSuccessfulReturnMessage() {
        //givem
        Book newBook = new Book("Miguel de Cervantes", "Don Quixote", 1605);
        //when
        assertThat(newBook.returnBook(), is("Thank you for returning the book"));
    }

}

