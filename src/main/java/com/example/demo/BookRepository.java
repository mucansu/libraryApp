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

    private final ArrayList<Book> books = new ArrayList<>();
    public BookRepository () {

        books.add(new Book("1", "Death", "J.ad","Horror",null));
        books.add(new Book("2", "Death", "J.Kim son","Horror",null));
        books.add(new Book("3", "Death", "J.sad","Horror",null));
        books.add(new Book("978-3-16-148410-0", "A Tale of Two Cities", "Charles Dickens","Historical Fiction","A story set in London and Paris before and during the French Revolution. The novel depicts the plight of the French peasantry demoralized by the French aristocracy in the years leading up to the revolution."));

        books.add(new Book("978-0-670-82162-4", "To Kill a Mockingbird", "Harper Lee","Southern Gothic, Bildungsroman","The unforgettable novel of a childhood in a sleepy Southern town and the crisis of conscience that rocked it."));

        books.add(new Book("978-0-7432-7356-5", "The Da Vinci Code", "Dan Brown","Mystery, Thriller","A gripping bestseller that combines conspiracy, history, and art. Follow symbologist Robert Langdon in a thrilling race against time."));

        books.add(new Book("978-1-4000-3467-0", "The Great Gatsby", "F. Scott Fitzgerald","Tragedy","A classic of twentieth-century literature, this novel offers a damning and insightful critique of the American dream in an age of unprecedented prosperity and material excess."));

        books.add(new Book("978-0-345-39180-3", "1984", "George Orwell","Dystopian, Political Fiction","A dystopian novel set in Airstrip One, formerly Great Britain, a province of the superstate Oceania, in a world of perpetual war, omnipresent government surveillance, and public manipulation."));


    }
    Book findByIsbn (String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}


