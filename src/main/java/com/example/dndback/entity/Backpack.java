package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "backpack")
@RequiredArgsConstructor
public class Backpack {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "backpack")
    private Set<Items> items;

}
