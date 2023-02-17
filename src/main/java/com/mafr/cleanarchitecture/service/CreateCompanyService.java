package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.service.in.CreateCompanyUseCase;
import com.mafr.cleanarchitecture.service.out.CreateCompanyPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyService implements CreateCompanyUseCase {
    private final CreateCompanyPort createCompanyPort;

    @Override
    public Company creatCompany(Company company) {
        return createCompanyPort.createCompany(company);
    }
}
