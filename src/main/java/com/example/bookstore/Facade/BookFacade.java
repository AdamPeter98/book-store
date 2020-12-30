package com.example.bookstore.Facade;

import com.example.bookstore.Dto.BookDto;

import java.util.List;

public interface BookFacade {
    List<BookDto> getBookDtos();
    BookDto getBookDto(Long id);
    List<BookDto> getBookDtoByCategoryId(Long id);
}
