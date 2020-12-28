package com.example.bookstore.DAO;

import com.example.bookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Long> {
}
