package com.example.dndback.entity;

import com.example.dndback.dto.DiceType;
import com.example.dndback.dto.Origin;
import com.example.dndback.dto.Worldview;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Table(name = "hero")
@RequiredArgsConstructor
public class Character {//сделать так тчобы миньон и персонаж унаследовались от одной таблицы, но миньону не доступна прокачка

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column
    private int level;

    @Column
    private int speed;

    @Column
    private int initiationBonus;

    @Column
    private int hp;

    @Column
    private int armorClass;//чеки, состояния и эффекты перенести в ДТО, которая будет учитывать в рантайме в бд нести не надо

    @Column
    private DiceType dice;

    @Column
    private int exp;

    @Column
    private boolean inspiration;

    @OneToMany(mappedBy="hero")
    private Set<Special> specials;

//    @Column  something
//    private int level;
//
//    @Column
//    private int level;

    @OneToMany(mappedBy="hero")
    private Set<Spells> spells;

    @OneToMany(mappedBy="hero")
    private Set<Minion> minions;

    @OneToMany(mappedBy="hero")//Настроить каскадное удаление для всех таких полей
    private Set<Skill> skills;

    @OneToOne
    private Backpack backpack;

    @OneToOne
    private Races races;

    @OneToOne//хз мб другой тип связи уточнить с дроном
    private Classes classes;

    @Column
    private Origin origin;

    @Column
    private Worldview worldview;

    @OneToOne
    private PersonalityTraits personalityTraits;

    @OneToOne
    private Attribute attributes;
}
