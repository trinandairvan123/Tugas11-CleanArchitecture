package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.Employee;
import com.mafr.cleanarchitecture.service.in.CreateEmployeeUseCase;
import com.mafr.cleanarchitecture.service.out.CreateEmployeePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateEmployeeService implements CreateEmployeeUseCase {
    private final CreateEmployeePort createEmployeePort;

    @Override
    public Employee addEmployeeToCompany(Long companyId, Employee employee) {
        return createEmployeePort.addEmployeeToCompany(companyId, employee);
    }
}
