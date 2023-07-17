package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    BookService bookService;
    @GetMapping("/Home")
    public String mainPage() {
        return "Home";

    }

    @GetMapping("/Books/Search")
    public ResponseEntity<Book> searcBooks() {

return bookService.searchByIsbn("123214");
    }
}