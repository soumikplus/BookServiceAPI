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
        bookService.addBook(new Book(1,"Autobiography","Wings of Fire","A.P.J. Abdul Kalam"));
        bookService.addBook(new Book(2,"Autobiography","The Story of My Experiments with Truth","Mahatma Gandhi"));
        bookService.addBook(new Book(1,"Motivational","The Alchemist","Paulo Coelho"));
        bookService.addBook(new Book(2,"Motivational","Think and Grow Rich","Napoleon Hill"));

    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/{type}")
    public ResponseEntity<List<Book>> getBooksByTypes(@PathVariable String type){
        List<Book> booksOfType = bookService.getBookByType(type);
        if(!booksOfType.isEmpty()){
            return ResponseEntity.ok(booksOfType);
        }
        else return ResponseEntity.notFound().build();
    }

    @GetMapping("/{type}/{id}")
    public ResponseEntity<Book> getBookByTypeAndId(@PathVariable String type,@PathVariable int id){
        Book foundBook = bookService.getBookByTypeAndId(type,id);
        if(foundBook!= null){
            return ResponseEntity.ok(foundBook);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.addBook(book));
    }

}
