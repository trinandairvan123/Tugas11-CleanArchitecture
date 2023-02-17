package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.Company;

public interface CreateCompanyPort {
    Company createCompany(Company company);
}
