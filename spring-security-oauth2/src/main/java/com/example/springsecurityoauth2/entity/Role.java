package com.example.springsecurityoauth2.entity;

import com.example.springsecurityoauth2.model.enums.RoleName;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    RoleName roleName;
}
