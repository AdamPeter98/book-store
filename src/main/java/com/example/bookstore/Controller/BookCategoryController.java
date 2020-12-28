package com.example.bookstore.Controller;

import com.example.bookstore.Dto.BookCategoryDto;
import com.example.bookstore.Facade.Impl.BookCategoryFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookCategoryController {

    @Autowired
    private BookCategoryFacadeImpl bookCategoryFacade;

    @GetMapping("/book-categories")
    public List<BookCategoryDto> getBooks() {
        return bookCategoryFacade.getBookCategoryDtos();
    }

    @GetMapping("/book-category/{id}")
    public BookCategoryDto getBooks(@PathVariable Long id) {
        return bookCategoryFacade.getBookCategoryDto(id);
    }
}
