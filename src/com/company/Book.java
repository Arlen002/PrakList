package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Comparable<Book>, Serializable {
    private String title;
    private String isbn;
    private int edition;
    private double price;
    private ArrayList<Author> author = new ArrayList<>();

    public Book(){}

    public Book(String title,String isbn, int edition, double price,String name) {
        this.isbn = isbn;
        this.edition = edition;
        this.price = price;
        this.title = title;
        this.addAuthor(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<Author> author) {
        this.author = author;
    }
    public void addAuthor(String name){
       author.add(new Author(name));
    }

    @Override
    public String toString() {
        return  "Book --> " +
                " title : " + title + '\'' +
                " isbn : " + isbn + '\'' +
                " edition : " + edition +
                ", price : " + price +
                ", author : " + author+"\n"
                ;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }
}
