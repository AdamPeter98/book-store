package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.BookWithoutCategoryDto;
import com.example.bookstore.Entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookWithoutCategoryDtoPopulator implements Populator<Book, BookWithoutCategoryDto> {
    @Override
    public void populate(Book source, BookWithoutCategoryDto target) {
        target.setName(source.getName());
        target.setImageUrl(source.getImageUrl());
        target.setDescription(source.getDescription());
        target.setUnitPrice(source.getUnitPrice());
        target.setUnitsInStock(source.getUnitsInStock());
    }
}
