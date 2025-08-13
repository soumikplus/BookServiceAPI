package com.example.BookServiceAPI;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book addBook(Book book);
    Book getBookByTypeAndId(String type,int id);
    List<Book> getBookByType(String type);
}
