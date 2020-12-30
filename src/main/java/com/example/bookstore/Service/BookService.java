package com.example.bookstore.Service;

import com.example.bookstore.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBook(Long id);
    List<Book> getAllBooksByCategoryId(Long id);
}
