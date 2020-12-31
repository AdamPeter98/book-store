package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.BookCategoryDto;
import com.example.bookstore.Dto.BookDto;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookToBookDtoPopulator implements Populator<Book, BookDto> {

    @Autowired
    BookCategoryToBookCategoryDtoPopualtor bookToBookDtoPopulator;

    @Override
    public void populate(Book source, BookDto target) {

        BookCategory bookCategory = source.getBookCategory();
        BookCategoryDto bookCategoryDto = new BookCategoryDto();

        bookToBookDtoPopulator.populate(bookCategory,bookCategoryDto);

        target.setId(source.getId());
        target.setName(source.getName());
        target.setActive(source.isActive());
        target.setBookCategoryDto(bookCategoryDto);
        target.setDescription(source.getDescription());
        target.setUnitPrice(source.getUnitPrice());
        target.setImageUrl(source.getImageUrl());
    }
}
