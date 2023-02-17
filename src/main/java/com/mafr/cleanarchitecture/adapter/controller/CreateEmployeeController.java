package com.mafr.cleanarchitecture.adapter.controller;

import com.mafr.cleanarchitecture.entity.Employee;
import com.mafr.cleanarchitecture.service.in.CreateEmployeeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CreateEmployeeController {
    private final CreateEmployeeUseCase createEmployeeUseCase;

    @PostMapping("/{companyId}/employees")
    public Employee addEmployeeToCompany(@PathVariable Long companyId, @RequestBody Employee employee) {
        return createEmployeeUseCase.addEmployeeToCompany(companyId, employee);
    }
}
