package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


public class BookService {
    @Autowired
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    void searchByIsbn(String isbn){
            System.out.printf("Searching for books with ISBN %s\n", isbn);
            bookRepository.findByIsbn(isbn);
            Book book = bookRepository.findByIsbn(isbn);
            if (book!=null){
                System.out.printf("1 book found : \n\t Title : %s\n\tAuthor : %s\n\t Genre : %s ", book.getTitle(), book.getAuthor(), book.getGenre());
            }
            else {
                System.out.print("0 book found.");

            }
            System.out.println("\n\n");
        }

    }

