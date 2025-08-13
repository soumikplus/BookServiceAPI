package com.example.BookServiceAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<String> homepage(){
        return ResponseEntity.ok().header("Content-Type","text/html").body("<b>Welcome to the Book Service API! Use /books to view all books.</b>");
    }
}
