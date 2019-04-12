package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class WelcomeTest {
    @Test
    public void welcomeMessageAppears() {
        //given
        //a welcome object
        Welcome welcome = new Welcome;
        assertThat(welcome.greeting(), "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        //when
        //a message method is called

        //then
        //it returns the welcome message
    }
}
