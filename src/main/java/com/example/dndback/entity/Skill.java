package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skill")
@RequiredArgsConstructor
public class Skill {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="hero_id", nullable=false)
    private Character hero;
}
