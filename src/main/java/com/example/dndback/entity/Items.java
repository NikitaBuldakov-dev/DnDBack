package com.example.dndback.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item")
@RequiredArgsConstructor
public class Items {//для будущего сделать так, чтобы надетые предметы сами давали бонус и высчитывали доп статы и резисты, сделать родительским классом а дальше от него делать оружие и тд

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="backpack_id", nullable=false)
    private Backpack backpack;
}
