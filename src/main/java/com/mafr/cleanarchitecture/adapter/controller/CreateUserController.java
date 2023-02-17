package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.UserEntity;
import com.mafr.cleanarchitecture.service.in.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class CreateUserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public UserEntity CreateUser(@RequestBody UserEntity userEntity) {
        return createUserUseCase.createUser(userEntity);
    }
}
