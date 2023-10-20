package com.example.newProject.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/user")

public class userController {

    @GetMapping(value = "/getUser")
    public String getUser(){
        return "Getting User info";
    }

    @GetMapping(value = "/deleteUser")
    public String deleteUser(){
        return "User Deleted";
    }

    @GetMapping(value = "/updateUser")
    public String updateUser(){
        return "User Updated";
    }
}
