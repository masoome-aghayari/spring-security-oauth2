package com.example.springsecurityoauth2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
