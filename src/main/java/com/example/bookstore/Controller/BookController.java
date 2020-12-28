package com.example.bookstore.Controller;

import com.example.bookstore.Dto.BookDto;
import com.example.bookstore.Facade.Impl.BookFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookController {

    @Autowired
    private BookFacadeImpl bookFacade;

    @GetMapping("/books")
    public List<BookDto> getBooks(){return bookFacade.getBookDtos();}

    @GetMapping("/book/{id}")
    public BookDto getBooks(@PathVariable Long id){return bookFacade.getBookDto(id);}
}
