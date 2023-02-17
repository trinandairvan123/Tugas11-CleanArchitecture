package com.mafr.cleanarchitecture.service.in;

import com.mafr.cleanarchitecture.entity.Employee;

import java.util.List;

public interface GetAllEmployeeUseCase {
    List<Employee> getEmployeesByCompany(Long companyId);
}
