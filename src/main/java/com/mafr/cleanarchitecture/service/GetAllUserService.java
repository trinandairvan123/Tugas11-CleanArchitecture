package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.entity.UserEntity;
import com.mafr.cleanarchitecture.service.in.GetAllUserUseCase;
import com.mafr.cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {
    private final GetAllUserPort getAllUserPort;

    @Override
    public List<UserEntity> getAll() {
        return getAllUserPort.getAll();
    }
}
