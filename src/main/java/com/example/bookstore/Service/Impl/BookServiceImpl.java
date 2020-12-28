package com.example.bookstore.Service.Impl;

import com.example.bookstore.DAO.BookDao;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
