package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.UserEntity;
import com.mafr.cleanarchitecture.service.in.CreateUserUseCase;
import com.mafr.cleanarchitecture.service.out.CreateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final CreateUserPort createUserPort;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return createUserPort.createUser(userEntity);
    }
}
