package com.mafr.cleanarchitecture.service.out;

import com.mafr.cleanarchitecture.entity.Employee;

import java.util.List;

public interface GetAllEmployeePort {
    List<Employee> getEmployeesByCompany(Long companyId);
}
