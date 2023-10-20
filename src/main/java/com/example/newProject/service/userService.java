package com.example.newProject.service;

import com.example.newProject.dto.userDTO;
import com.example.newProject.entity.User;
import com.example.newProject.repo.userRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional  /*method will be executed within a database transaction, and if an exception occurs, the transaction will be rolled back, ensuring that the database remains in a consistent state.*/

public class userService {

    @Autowired
    private userRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public userDTO saveUser(userDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}