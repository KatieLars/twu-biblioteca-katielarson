package com.twu.biblioteca;

import java.util.Scanner;

public class Book {

    public String author;
    public String title;
    public int publicationDate;
    public boolean isCheckedOut;

    public Book (String author, String title, int publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
        this.isCheckedOut = false;
    }


    public String displayAllBookInfo() {
        System.out.println(this.author + " " + this.title + " " + this.publicationDate + " | ");
                //this returns a single line of all info for that book
        return this.author+ " " + this.title + " " + this.publicationDate + " | ";
    }

    public void grabUserInput() {
        Scanner reader = new Scanner(System.in);
        String newInput = reader.nextLine();
        //this.validateBookOption(newInput); eventually will validate that this book is available
    }

    public String checkOut() {
        this.isCheckedOut = true;
        //System.out.println("Thank you! Enjoy the book");
        return "Thank you! Enjoy the book";
    }

    public String returnBook() {
        this.isCheckedOut = false;
        return "Thank you for returning the book";
    }

}
