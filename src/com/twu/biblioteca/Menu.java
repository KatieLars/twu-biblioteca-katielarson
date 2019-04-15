package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Menu {

    private List<String> options = new ArrayList<>();

    public Menu() {
        this.options.add("List of Books");
        this.options.add("Quit");
    }


    public String displayOptions() {
        String menuOptions = "" ;
        for (String option : this.options) {
            System.out.println(option);
            menuOptions = menuOptions + option;
        }
        //this.grabUserInput();
        return menuOptions;
    }

    public void grabUserInput() {
        Scanner reader = new Scanner(System.in);
        String newInput = reader.nextLine();
        this.validateOption(newInput);
    }

    public String validateOption(String readerSelection) {

        switch(readerSelection) {
            case "List of Books":
                Library newLibrary = new Library();
                newLibrary.displayAllBooks();
                break;
            case "Quit":
                System.out.println("Exiting . . .");

                System.exit(0);
                return "Exiting ..."
                break;
                //should quit program
            default:
                System.out.println("Please select a valid option!");
                //this.grabUserInput();
                return "Please select a valid option!";
        }

        return readerSelection;
    }

}
