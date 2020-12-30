package com.example.bookstore.Controller;

import com.example.bookstore.Dto.BookDto;
import com.example.bookstore.Facade.Impl.BookFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    private BookFacadeImpl bookFacade;

    @GetMapping("/books")
    public List<BookDto> getBooks(){return bookFacade.getBookDtos();}

    @GetMapping("/books/{id}")
    public BookDto getBooks(@PathVariable Long id){return bookFacade.getBookDto(id);}

}
