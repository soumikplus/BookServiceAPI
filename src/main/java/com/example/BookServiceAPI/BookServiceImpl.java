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

    @Override
    public Book getBookByTypeAndId(String type, int id) {
        for(Book b : books){
            if(b.getType().equalsIgnoreCase(type) && b.getId()==id){
                return b;
            }
        }
        return null; // means not found
    }

    @Override
    public List<Book> getBookByType(String type) {
        List<Book>result = new ArrayList<>();
        for(Book b : books){
            if(b.getType().equalsIgnoreCase(type)){
                result.add(b);
            }
        }
        return result;
    }
}
