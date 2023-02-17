package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.service.in.CreateCompanyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CreateCompanyController {
    private final CreateCompanyUseCase createCompanyUseCase;

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return createCompanyUseCase.creatCompany(company);
    }
}
