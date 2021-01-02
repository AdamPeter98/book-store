package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.UserDto;
import com.example.bookstore.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUserPopulator implements Populator<UserDto, User> {
    @Override
    public void populate(UserDto source, User target) {
        target.setUserName(source.getUserName());
        target.setEmail(source.getEmail());
        target.setPassword(source.getEmail());
        target.setAddress(source.getAddress());
    }
}
