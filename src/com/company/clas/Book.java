package com.company.clas;

public class Book {
    private String titleBook;
    private String author;
    private int id;
    private static int idCounter;

    public Book(){
        id = generateId();
    }
    public int getId() { return id;}

    public int generateId(){
        return idCounter++;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
