package com.mafr.cleanarchitecture.service.in;

import com.mafr.cleanarchitecture.entity.UserEntity;

public interface CreateUserUseCase {
    UserEntity createUser(UserEntity userEntity);
}
