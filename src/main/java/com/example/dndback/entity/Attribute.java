package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "attribute")
@RequiredArgsConstructor
public class Attribute {
    @Id
    @GeneratedValue
    private Long id;
}
