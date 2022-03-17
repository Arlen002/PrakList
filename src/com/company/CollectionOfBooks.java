package com.company;

import java.util.ArrayList;

public class CollectionOfBooks {

    private ArrayList<Book> books = new ArrayList<>();
    public  CollectionOfBooks(){}
    public CollectionOfBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getArrayList() {
        return books;
    }

    public void setArrayList(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        books.remove(index);
    }

   public Book getBook(int index) {
        return books.get(index);
    }

    public int size() {
        return books.size();
    }

    public ArrayList<Book> getList() {
        return books;
    }

    public ArrayList<Book> searchTitle(String title) {
        ArrayList<Book> title2 = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (title.compareTo(books.get(i).getTitle()) == 0) {
                title2.add(books.get(i));
            }
        }
        return title2;
    }

    public ArrayList<Book> searchIsbn(String code) {
        ArrayList<Book> isbn2 = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (code.compareTo(books.get(i).getIsbn()) == 0) {
                isbn2.add(books.get(i));
            }

        }
        return isbn2;
    }

    public ArrayList<Book> searchAuthor(String author) {
        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Book> books1 = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            authors = books.get(i).getAuthor();
            for (int j = 0; j < authors.size(); j++) {
                if (author.compareTo(authors.get(j).getName()) == 0) {
                    books1.add(books.get(i));
                }
            }
        }
        return books1 ;
    }

    @Override
    public String toString() {
        String name = "";
        for (int i = 0; i < books.size(); i++) {
            name  += books.get(i).toString()+"\n";

        }
        return name;
    }
}
