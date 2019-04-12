package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class WelcomeTest {
    @Test
    public void welcomeMessageAppears() {
        //given
        Welcome welcome = new Welcome();
        //when
        String newGreeting = welcome.greeting();
        //then
        assertThat(newGreeting, is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));

    }
}
