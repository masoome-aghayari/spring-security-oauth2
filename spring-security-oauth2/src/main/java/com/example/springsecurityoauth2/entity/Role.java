package com.example.springsecurityoauth2.entity;

import com.example.springsecurityoauth2.entity.enums.RoleName;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    RoleName roleName;
}
