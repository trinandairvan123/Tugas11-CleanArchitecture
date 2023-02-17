package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.UserEntity;

public interface CreateUserPort {
    UserEntity createUser(UserEntity userEntity);
}
