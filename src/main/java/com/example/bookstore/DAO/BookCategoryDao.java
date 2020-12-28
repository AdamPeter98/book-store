package com.example.bookstore.DAO;

import com.example.bookstore.Entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryDao extends JpaRepository<BookCategory,Long> {
}
