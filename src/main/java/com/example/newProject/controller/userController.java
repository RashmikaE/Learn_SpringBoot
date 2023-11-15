package com.example.newProject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.newProject.dto.userDTO;
import com.example.newProject.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/user")

public class userController {

    @Autowired
    private userService UserService;

    @GetMapping(value = "/getUsers")
    public List<userDTO> getUser(){
        return UserService.getAllUsers();
    }

    @PostMapping(value = "/newUser")
    public userDTO newUser(@RequestBody userDTO UserDto){
        return UserService.saveUser(UserDto);
    }

    @PutMapping(value = "/updateUser")
    public userDTO updateUser(@RequestBody userDTO userDTO){
        return UserService.updateUser(userDTO);
    }

    @DeleteMapping(value = "/deleteUser")
    public boolean deleteUser(@RequestBody userDTO userDTO){
        return UserService.deleteUser(userDTO);
    }
}
