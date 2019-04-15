package com.twu.biblioteca;

public class Book {

    public String author;
    public String title;
    public int publicationDate;

    public Book (String author, String title, int publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
    }


    public String displayAllBookInfo() {
        System.out.println(this.author + " " + this.title + " " + this.publicationDate + " | ");
                //this returns a single line of all info for that book
        return this.author+ " " + this.title + " " + this.publicationDate + " | ";
    }

}
