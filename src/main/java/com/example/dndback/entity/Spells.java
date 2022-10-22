package com.example.dndback.entity;

import com.example.dndback.dto.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "spell")
@RequiredArgsConstructor
public class Spells {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String wording;//перенести это в ДТО, а в бд сделать параметры для игровой эммуляции, а в ДТО просто парсить это гавно

    @Column
    private SpellType type;

    @Column
    private CreationTime creationTime;

    @Column
    private School school;

    @Column
    private Circle circle;

    @Column
    private Distance distance;

    @Column
    private SpellDuration spellDuration;

    @Column
    private boolean concentration;

    @ManyToOne
    @JoinColumn(name="hero_id", nullable=false)
    private Character hero;
}
