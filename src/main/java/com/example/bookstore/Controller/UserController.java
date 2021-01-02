package com.example.bookstore.Controller;


import com.example.bookstore.Dto.UserDto;
import com.example.bookstore.Facade.Impl.UserFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class UserController {

    @Autowired
    private UserFacadeImpl userFacade;

    @PostMapping("/api/v1//register")
    public String register(@RequestBody UserDto userDto) {
        userFacade.insertUser(userDto);
        return "User registered, have fun!";

    }

    @GetMapping("/api/v1//getAllUsers")
    public List<UserDto> getUsers(){
        return userFacade.getAllUser();
    }


}
