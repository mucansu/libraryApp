package com.example.demo;
import java.util.ArrayList;

public class BookRepository {
    /*private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(String isbn, String title, String genre, String description, String author){

        books.add(new Book(isbn: "83451", title:"The Death", genre:"Horror", description:null, author: "J.Eleton"));
        books.add(new Book(isbn: "83451", title:"The Death", genre:"Horror", description:null, author: "J.Eleton"));
        books.add(new Book(isbn: "83451", title:"The Death", genre:"Horror", description:null, author: "J.Eleton"));
        books.add(new Book(isbn: "83451", title:"The Death", genre:"Horror", description:null, author: "J.Eleton"));


    }
Book findByIsbn(String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
        */

    private ArrayList<Book> books = new ArrayList<>();
    public BookRepository () {

        books.add(new Book("123214", "Death", "J.ad","Horror",null));
        books.add(new Book("123214", "Death", "J.Kim son","Horror",null));
        books.add(new Book("123214", "Death", "J.sad","Horror",null));

    }
    Book findByIsbn (String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
}


