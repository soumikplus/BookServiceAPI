package com.example.BookServiceAPI;

import com.example.BookServiceAPI.BookService;
import com.example.BookServiceAPI.Book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
        bookService.addBook(new Book("The Man I Love","Soumajit Majumder"));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.addBook(book));
    }

}
