package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.BookCategoryDto;
import com.example.bookstore.Entity.BookCategory;
import org.springframework.stereotype.Component;

@Component
public class BookCategoryToBookCategoryDtoPopualtor implements Populator<BookCategory, BookCategoryDto> {

    @Override
    public void populate(BookCategory source, BookCategoryDto target) {
        target.setCategoryName(source.getCategoryName());
    }
}
