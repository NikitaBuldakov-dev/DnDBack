package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String mail;

    @Column
    private String password;

    @OneToMany(mappedBy="user")
    private Set<Character> characters;
}
