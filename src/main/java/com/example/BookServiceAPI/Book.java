package com.example.BookServiceAPI;

public class Book{
    private int id;
    private String type;
    private String title;
    private String author;

    public Book(int id,String type,String title,String author){
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
    }
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public String getTitle(){
        return  title;
    }
    public String getAuthor(){
        return author;
    }
}
