package com.example.dndback.dto;

import com.example.dndback.entity.User;

public record UserDTO(User user, String token) {
}
