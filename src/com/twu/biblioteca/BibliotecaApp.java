package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome newWelcome = new Welcome();
        newWelcome.greeting();
        Menu newMenu = new Menu();
        newMenu.displayOptions();

    }
}
