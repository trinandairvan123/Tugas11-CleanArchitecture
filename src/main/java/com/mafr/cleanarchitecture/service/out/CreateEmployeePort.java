package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.Employee;

public interface CreateEmployeePort {
    Employee addEmployeeToCompany(Long companyId, Employee employee);
}
