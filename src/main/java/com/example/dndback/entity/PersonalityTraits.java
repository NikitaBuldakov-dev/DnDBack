package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "personality_traits")
@RequiredArgsConstructor
public class PersonalityTraits {

    @Id
    @GeneratedValue
    private Long id;
}
