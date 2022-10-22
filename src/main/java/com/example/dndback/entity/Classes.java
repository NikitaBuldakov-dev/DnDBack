package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "classes")
@RequiredArgsConstructor
public class Classes {//модификаторы персонажа хранятся тут
    @Id
    @GeneratedValue
    private Long id;
}
