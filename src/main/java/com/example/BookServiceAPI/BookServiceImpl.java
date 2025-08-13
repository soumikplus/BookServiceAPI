package com.example.BookServiceAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private List<Book>books = new ArrayList<>();
    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
