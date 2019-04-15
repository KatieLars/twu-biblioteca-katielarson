package com.twu.biblioteca;

public class Book {

    public String author;
    public String title;
    public double publicationDate;

    public Book (String author, String title, double publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
    }


    public String displayAllBookInfo() {
        System.out.println(this.title + " " + this.author + " " + this.publicationDate + " | ");
                //this returns a single line of all info for that book
        return this.title + " " + this.author + " " + this.publicationDate + " | ";
    }

}
