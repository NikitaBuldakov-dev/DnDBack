package com.example.dndback.api;

import com.example.dndback.dto.UserDTO;
import com.example.dndback.dto.WelcomeDTO;
import com.example.dndback.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    @CrossOrigin
    public UserDTO getUser() {

        return null;
    }

    @PostMapping
    @CrossOrigin
    public UserDTO createUser() {
        return null;
    }
}
