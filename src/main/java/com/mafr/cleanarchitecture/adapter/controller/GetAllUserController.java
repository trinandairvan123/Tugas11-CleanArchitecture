package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.UserEntity;
import com.mafr.cleanarchitecture.service.in.GetAllUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GetAllUserController {
    private final GetAllUserUseCase getAllUserUseCase;

    @GetMapping
    public List<UserEntity> getAll(){
        return getAllUserUseCase.getAll();
    }
}
