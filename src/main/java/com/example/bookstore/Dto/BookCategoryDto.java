package com.example.bookstore.Dto;

public class BookCategoryDto {

    private String categoryName;

    public BookCategoryDto(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public BookCategoryDto() {
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
