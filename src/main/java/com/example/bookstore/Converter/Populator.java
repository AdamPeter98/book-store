package com.example.bookstore.Converter;

public interface Populator<T,U>{
    void populate(T source, U target);
}
