package com.example.bookstore.Service.Impl;

import com.example.bookstore.DAO.BookCategoryDao;
import com.example.bookstore.Entity.BookCategory;
import com.example.bookstore.Service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookCategoryServiceImpl implements BookCategoryService {
    @Autowired
    private BookCategoryDao bookCategoryDao;

    @Override
    public List<BookCategory> getAllBooks() {
        return bookCategoryDao.findAll();
    }

    @Override
    public BookCategory getBook(Long id) {

        return bookCategoryDao.getOne(id);
    }
}
