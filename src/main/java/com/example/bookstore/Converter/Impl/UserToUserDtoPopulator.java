package com.example.bookstore.Converter.Impl;

import com.example.bookstore.Converter.Populator;
import com.example.bookstore.Dto.UserDto;
import com.example.bookstore.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDtoPopulator implements Populator<User, UserDto> {
    @Override
    public void populate(User source, UserDto target) {
        target.setId(source.getId());
        target.setUserName(source.getUserName());
        target.setEmail(source.getEmail());
        target.setPassword(source.getEmail());
    }
}
