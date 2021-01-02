package com.example.bookstore.Service.Impl;

import com.example.bookstore.DAO.UserDao;
import com.example.bookstore.Entity.User;
import com.example.bookstore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public void insertUser(User user) {
        userDao.save(user);
    }


    @Override
    public boolean userExists(User user) {
        return userDao.existsById(user.getId());
    }
}
