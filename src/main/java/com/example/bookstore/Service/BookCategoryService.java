package com.example.bookstore.Service;

import com.example.bookstore.Entity.BookCategory;

import java.util.List;

public interface BookCategoryService {
    List<BookCategory> getAllBooks();

    BookCategory getBook(Long id);
}
