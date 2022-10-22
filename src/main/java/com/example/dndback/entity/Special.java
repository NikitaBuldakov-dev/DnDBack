package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "special")
@RequiredArgsConstructor
public class Special {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="hero_id", nullable=false)
    private Character hero;
}
