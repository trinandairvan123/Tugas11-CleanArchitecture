package com.mafr.cleanarchitecture.adapter.persistence;

import com.mafr.cleanarchitecture.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
