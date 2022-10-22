package com.example.dndback.service;

import com.example.dndback.dto.WelcomeDTO;
import com.example.dndback.entity.User;
import com.example.dndback.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class WelcomeService {

    private final UserRepository userRepository;


    public WelcomeDTO getWelcomePage() {
        User user = new User();
        user.setName("MegaMasturbator2000");
        user.setMail("mamu_v_kanave_nashel@milfhaunter.fuck");
        user.setPassword("DrOnLoH_aHaHaHaHa");
        userRepository.save(user);
        return new WelcomeDTO(user.toString(), 200);
    }
}
