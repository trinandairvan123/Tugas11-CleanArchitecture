package com.mafr.cleanarchitecture.service.in;

import com.mafr.cleanarchitecture.entity.Company;

import java.util.List;

public interface GetAllCompanyUseCase {
    List<Company> getAll();
}
