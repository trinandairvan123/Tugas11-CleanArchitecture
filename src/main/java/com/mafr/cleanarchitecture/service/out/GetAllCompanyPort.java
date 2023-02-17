package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.Company;

import java.util.List;

public interface GetAllCompanyPort {
    List<Company> getAll();
}
