package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.Employee;
import com.mafr.cleanarchitecture.service.in.GetAllEmployeeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class GetAllEmployeeController {
    private final GetAllEmployeeUseCase getAllEmployeeUseCase;

    @GetMapping("/{companyId}/employees")
    public List<Employee> getEmployeesByCompany(@PathVariable Long companyId) {
        return getAllEmployeeUseCase.getEmployeesByCompany(companyId);
    }
}
