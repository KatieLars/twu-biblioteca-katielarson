package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LibraryTest {
    @Test
    public void shouldGetAllBooksInLibrary() {
        //given
        String[] manualLibrary = new String[]{"Don Quixote", "Les Fleurs du Mal", "War and Peace"};
        Library library = new Library();
        //when
        library.setAllBooks();
        //then
        assertThat(library.getAllBooks(), is(manualLibrary));

    }
}
