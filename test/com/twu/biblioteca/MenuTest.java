package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class MenuTest {
    @Test
    public void shouldShowOptions() {
        //given
        Menu newMenu = new Menu();
        assertThat(newMenu.displayOptions(), is("List of BooksQuit"));
    }

    @Test
    public void shouldInvalidateReaderSelection() {
        Menu newMenu = new Menu();
        String readerSelection = "This is invalid";
        assertThat(newMenu.validateOption(readerSelection), is("Please select a valid option!"));

    }

    @Test
    public void shouldAllowUserToDisplayAllBooks() {
        //given
        Menu newMenu = new Menu();
        String readerSelection = "List of Books";
        //displays a list of books
        assertThat(newMenu.validateOption(readerSelection), is("Charles Baudelaire Les Fleurs du Mal 1876 | "));
    }

    @Test
    public void shouldBeAbleToExitProgram() {
        Menu newMenu = new Menu();
        String readerSelection = "Quit";
        assertThat(newMenu.validateOption(readerSelection), is("Exiting ..."));

    }

}

