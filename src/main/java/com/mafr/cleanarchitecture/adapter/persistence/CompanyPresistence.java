package com.mafr.cleanarchitecture.adapter.persistence;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.service.out.CreateCompanyPort;
import com.mafr.cleanarchitecture.service.out.GetAllCompanyPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CompanyPresistence implements CreateCompanyPort, GetAllCompanyPort {
    private final CompanyRepository companyRepository;

    @Override
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }
}
