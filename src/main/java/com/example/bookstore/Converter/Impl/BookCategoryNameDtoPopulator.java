package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.BookCategoryNameDto;
import com.example.bookstore.Entity.BookCategory;
import org.springframework.stereotype.Component;

@Component
public class BookCategoryNameDtoPopulator implements Populator<BookCategory, BookCategoryNameDto> {

    @Override
    public void populate(BookCategory source, BookCategoryNameDto target) {
        target.setCategoryName(source.getCategoryName());
    }
}
