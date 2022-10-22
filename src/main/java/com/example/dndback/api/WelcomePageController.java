package com.example.dndback.api;

import com.example.dndback.dto.WelcomeDTO;
import com.example.dndback.service.WelcomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
@RequiredArgsConstructor
public class WelcomePageController {

    private final WelcomeService welcomeService;

    @GetMapping
    @CrossOrigin
    public WelcomeDTO showStatus() {

        return welcomeService.getWelcomePage();
    }
}
