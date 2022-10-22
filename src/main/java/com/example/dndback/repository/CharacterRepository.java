package com.example.dndback.repository;

import com.example.dndback.entity.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}
