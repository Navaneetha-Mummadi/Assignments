package com.springboot6.controller;

import com.springboot6.model.Book;
import com.springboot6.model.BookList;
import com.springboot6.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public BookList getBooks() {
        return new BookList(bookService.getAllBooks());
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully";
    }
}
