package com.mafr.cleanarchitecture.adapter.persistence;

import com.mafr.cleanarchitecture.entity.UserEntity;
import com.mafr.cleanarchitecture.service.out.CreateUserPort;
import com.mafr.cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPresistence implements CreateUserPort, GetAllUserPort {
    private final UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
