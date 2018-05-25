package com.example.frank_ye.wedding;

import java.io.Serializable;

public class Book implements Serializable{
    private String book_name;
    private String book_isbn;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }
}
