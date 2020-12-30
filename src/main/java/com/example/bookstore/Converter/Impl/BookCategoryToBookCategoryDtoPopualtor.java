package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.BookCategoryDto;
import com.example.bookstore.Dto.BookWithoutCategoryDto;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookCategoryToBookCategoryDtoPopualtor implements Populator<BookCategory, BookCategoryDto> {

    @Autowired
    private BookWithoutCategoryDtoPopulator bookWithoutCategoryDtoPopulator;

    @Override

    public void populate(BookCategory source, BookCategoryDto target) {

        List<Book> bookList = source.getBook();
        List<BookWithoutCategoryDto> bookWithoutCategoryDtos = new ArrayList<>();

        bookList.forEach(book -> {
            BookWithoutCategoryDto bookWithoutCategoryDto = new BookWithoutCategoryDto();
            bookWithoutCategoryDtoPopulator.populate(book,bookWithoutCategoryDto);
            bookWithoutCategoryDtos.add(bookWithoutCategoryDto);
        });

        target.setBookDtos(bookWithoutCategoryDtos);
        target.setCategoryName(source.getCategoryName());
    }
}
