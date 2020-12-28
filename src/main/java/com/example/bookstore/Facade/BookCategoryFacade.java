package com.example.bookstore.Facade;

import com.example.bookstore.Dto.BookCategoryDto;

import java.util.List;

public interface BookCategoryFacade {
    List<BookCategoryDto> getBookCategoryDtos();

    BookCategoryDto getBookCategoryDto(Long id);
}
