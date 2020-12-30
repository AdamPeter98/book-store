package com.example.bookstore.Service.Impl;

import com.example.bookstore.DAO.BookDao;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book getBook(Long id) {
        return bookDao.getOne(id);
    }

    @Override
    public List<Book> getAllBooksByCategoryId(Long id) {
        List<Book> allBooks = bookDao.findAll();
        List<Book> specIdBooks = new ArrayList<>();
        allBooks.forEach(book -> {
            if (book.getBookCategory().getId() == id) {
                specIdBooks.add(book);
            }
        });
        return specIdBooks;
    }
}
