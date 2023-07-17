package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    BookService bookService;
    @GetMapping("/Home")
    public String mainPage() {
        return "Home";

    }

    @GetMapping("/Books/Search")
    public ResponseEntity<?> searcBooks(@PathVariable String Isbn) throws Exception {
        try {
            Book book = this.bookService.searchByIsbn(Isbn);
            if (book != null) {
                return new ResponseEntity<>(book, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/Books")
    public ResponseEntity<?> allBooks (){
      return new ResponseEntity<>(bookService.findAllBooks(),HttpStatus.OK);
    }
}