package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.entity.UserEntity;

import java.util.List;

public interface GetAllUserPort {
    List<UserEntity> getAll();
}
