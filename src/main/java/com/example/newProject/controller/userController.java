package com.example.newProject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.newProject.dto.userDTO;
import com.example.newProject.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/user")

public class userController {

    @Autowired
    private userService UserService;

    @GetMapping(value = "/getUser")
    public String getUser(){
        return "Getting User info";
    }

    @PostMapping(value = "/newUser")
    public userDTO newUser(@RequestBody userDTO UserDto){
        return UserService.saveUser(UserDto);
    }

    @DeleteMapping(value = "/deleteUser")
    public String deleteUser(){
        return "User Deleted";
    }

    @PutMapping(value = "/updateUser")
    public String updateUser(){
        return "User Updated";
    }
}
