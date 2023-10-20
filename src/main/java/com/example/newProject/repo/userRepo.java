package com.example.newProject.repo;

import com.example.newProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Integer> {


}
