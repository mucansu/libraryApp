package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BookService {
    @Autowired
    private Book book;
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    Book searchByIsbn(String isbn) throws Exception {
        System.out.printf("Searching for books with ISBN %s\n", isbn);
        bookRepository.findByIsbn(isbn);
        Book book = bookRepository.findByIsbn(isbn);
        if (book != null) {
            return book;
            // System.out.printf("1 book found : \n\t Title : %s\n\tAuthor : %s\n\t Genre : %s ", book.getTitle(), book.getAuthor(), book.getGenre());
        } else {
            throw new Exception("0 book found.");

        }
    }
    List<Book> findAllBooks (){
         return bookRepository.getBooks();
    }

    }

