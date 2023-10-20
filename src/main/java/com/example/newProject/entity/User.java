package com.example.newProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//Because of this Entity annotation, it will create a table User and also the id, name and the address fields

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private int id;
    private String name;
    private String address;

}
