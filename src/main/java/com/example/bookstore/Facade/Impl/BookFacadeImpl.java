package com.example.bookstore.Facade.Impl;

import com.example.bookstore.Converter.Impl.BookToBookDtoPopulator;
import com.example.bookstore.Dto.BookDto;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Facade.BookFacade;
import com.example.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookFacadeImpl implements BookFacade {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookToBookDtoPopulator bookToBookDtoPopulator;

    @Override
    public List<BookDto> getBookDtos() {
        List<Book> tempBooks = bookService.getAllBooks();
        List<BookDto> bookDto = new ArrayList<>();

        tempBooks.forEach(book -> {
            BookDto tempBookDto = new BookDto();
            bookToBookDtoPopulator.populate(book,tempBookDto);
            bookDto.add(tempBookDto);
        });
        return bookDto;

    }

    @Override
    public BookDto getBookDto(Long id) {
        Book book = bookService.getBook(id);
        BookDto bookDto = new BookDto();
        bookToBookDtoPopulator.populate(book,bookDto);
        return bookDto;
    }

    @Override
    public List<BookDto> getBookDtoByCategoryId(Long id) {
        List<Book> tempBooks = bookService.getAllBooksByCategoryId(id);
        List<BookDto> bookDto = new ArrayList<>();

        tempBooks.forEach(book -> {
            BookDto tempBookDto = new BookDto();
            bookToBookDtoPopulator.populate(book,tempBookDto);
            bookDto.add(tempBookDto);
        });
        return bookDto;
    }
}
