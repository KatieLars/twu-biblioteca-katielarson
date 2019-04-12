package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.lang.reflect.Array;

public class LibraryTest {

    public void shouldGetAllBooksInLibrary() {
        //given
        //a list of library books
        String[] manualLibrary = new String[]{"Don Quixote", "Les Fleurs du Mal", "War and Peace"};

        Library library = new Library();
        Array allBooks = library.getBooks();
        assertThat(allBooks, is(manualLibrary));
        //when
        //should appear after the greeting, when library list is populated
        //then
        //display the list of books
    }
}
