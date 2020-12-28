package com.example.bookstore.Facade.Impl;

import com.example.bookstore.Converter.Impl.BookCategoryToBookCategoryDtoPopualtor;
import com.example.bookstore.Dto.BookCategoryDto;
import com.example.bookstore.Entity.BookCategory;
import com.example.bookstore.Facade.BookCategoryFacade;
import com.example.bookstore.Service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookCategoryFacadeImpl implements BookCategoryFacade {

    @Autowired
    private BookCategoryService bookCategoryService;

    @Autowired
    private BookCategoryToBookCategoryDtoPopualtor bookCategoryToBookCategoryDtoPopualtor;

    @Override
    public List<BookCategoryDto> getBookCategoryDtos() {
        List<BookCategory> bookCategories = bookCategoryService.getAllBooks();
        List<BookCategoryDto> bookCategoryDto = new ArrayList<>();

        bookCategories.forEach(bookCategory -> {
            BookCategoryDto tempBookCategoryDto = new BookCategoryDto();
            bookCategoryToBookCategoryDtoPopualtor.populate(bookCategory, tempBookCategoryDto);
            bookCategoryDto.add(tempBookCategoryDto);
        });
        return bookCategoryDto;
    }

    @Override
    public BookCategoryDto getBookCategoryDto(Long id) {
        BookCategory bookCategory = bookCategoryService.getBook(id);
        BookCategoryDto bookCategoryDto = new BookCategoryDto();
        bookCategoryToBookCategoryDtoPopualtor.populate(bookCategory, bookCategoryDto);

        return bookCategoryDto;
    }

}
