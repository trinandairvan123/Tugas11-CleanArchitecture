package com.mafr.cleanarchitecture.service.in;

import com.mafr.cleanarchitecture.entity.Employee;

public interface CreateEmployeeUseCase {
    Employee addEmployeeToCompany(Long companyId, Employee employee);
}
