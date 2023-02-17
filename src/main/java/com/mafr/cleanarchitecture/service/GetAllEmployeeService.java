package com.mafr.cleanarchitecture.service;

import com.mafr.cleanarchitecture.entity.Employee;
import com.mafr.cleanarchitecture.service.in.GetAllEmployeeUseCase;
import com.mafr.cleanarchitecture.service.out.GetAllEmployeePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllEmployeeService implements GetAllEmployeeUseCase {
    private final GetAllEmployeePort getAllEmployeePort;

    @Override
    public List<Employee> getEmployeesByCompany(Long companyId) {
        return getAllEmployeePort.getEmployeesByCompany(companyId);
    }
}
