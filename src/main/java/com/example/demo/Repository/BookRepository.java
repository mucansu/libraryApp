package com.example.demo.Repository;

import com.example.demo.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByTitleContaining(String title);
    //When you call this method and pass a title,
    // Spring Data JPA will execute a query similar to this:
    // SELECT * FROM books WHERE title LIKE '%title%',
    // where books is the table corresponding to the Book entity and title is replaced with the actual title you passed.

    Book findByIsbn (String Isbn);
}
