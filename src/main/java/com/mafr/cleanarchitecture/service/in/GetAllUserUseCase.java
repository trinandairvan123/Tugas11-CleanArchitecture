package com.mafr.cleanarchitecture.service.in;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.entity.UserEntity;

import java.util.List;

public interface GetAllUserUseCase {
    List<UserEntity> getAll();
}
