package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "race")
@RequiredArgsConstructor
public class Races {
    @Id
    @GeneratedValue
    private Long id;
}
