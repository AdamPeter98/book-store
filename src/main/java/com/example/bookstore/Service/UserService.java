package com.example.bookstore.Service;

import com.example.bookstore.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
    void insertUser(User user);
    boolean userExists(User user);
}
