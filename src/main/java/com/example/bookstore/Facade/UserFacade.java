package com.example.bookstore.Facade;

import com.example.bookstore.Dto.UserDto;

import java.util.List;

public interface UserFacade {
    List<UserDto> getAllUser();

    UserDto getUserById(Long id);

    UserDto insertUser(UserDto userDto);

}
