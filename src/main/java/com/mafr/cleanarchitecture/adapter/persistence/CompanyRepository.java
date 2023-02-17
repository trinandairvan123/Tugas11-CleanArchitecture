package com.mafr.cleanarchitecture.adapter.persistence;

import com.mafr.cleanarchitecture.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
