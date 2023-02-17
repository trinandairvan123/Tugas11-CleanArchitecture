package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.service.in.GetAllCompanyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class GetAllCompanyController {
    private final GetAllCompanyUseCase getAllCompanyUseCase;

    @GetMapping
    public List<Company> getAll() {
        return getAllCompanyUseCase.getAll();
    }
}
