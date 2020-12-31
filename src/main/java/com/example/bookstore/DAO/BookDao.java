package com.example.bookstore.DAO;

import com.example.bookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookDao extends JpaRepository<Book, Long> {

    List<Book> findByNameContaining(String name);
}
