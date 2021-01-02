package com.example.bookstore.Facade.Impl;

import com.example.bookstore.Converter.Impl.UserDtoToUserPopulator;
import com.example.bookstore.Converter.Impl.UserToUserDtoPopulator;
import com.example.bookstore.Dto.UserDto;
import com.example.bookstore.Entity.User;
import com.example.bookstore.Facade.UserFacade;
import com.example.bookstore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    private UserToUserDtoPopulator userToUserDtoPopulator;

    private UserDtoToUserPopulator userDtoToUserPopulator;

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userService.getAllUser();
        List<UserDto> userDtos = new ArrayList<>();

        users.forEach(user -> {
            UserDto userDto = new UserDto();
            userToUserDtoPopulator.populate(user, userDto);
            userDtos.add(userDto);
        });
        return userDtos;
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = new User();
        user = userService.getUserById(id);
        UserDto userDto = new UserDto();
        userToUserDtoPopulator.populate(user, userDto);
        return userDto;
    }

    @Override
    public UserDto insertUser(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getEmail());
        user.setAddress(userDto.getAddress());

        return userDto;
    }


}
