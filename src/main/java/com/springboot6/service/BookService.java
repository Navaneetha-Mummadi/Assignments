package com.springboot6.service;

import com.springboot6.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getAllBooks() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }
}
