package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.service.in.GetAllCompanyUseCase;
import com.mafr.cleanarchitecture.service.out.GetAllCompanyPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllCompanyService implements GetAllCompanyUseCase {
    private final GetAllCompanyPort getAllCompanyPort;
    @Override
    public List<Company> getAll() {
        return getAllCompanyPort.getAll();
    }
}
