package com.mafr.cleanarchitecture.adapter.persistence;

import com.mafr.cleanarchitecture.entity.Company;
import com.mafr.cleanarchitecture.entity.Employee;
import com.mafr.cleanarchitecture.service.out.CreateEmployeePort;
import com.mafr.cleanarchitecture.service.out.GetAllEmployeePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeePresistence implements CreateEmployeePort, GetAllEmployeePort {
    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;

    @Override
    public Employee addEmployeeToCompany(Long companyId, Employee employee) {
        Company company = companyRepository.findById(companyId).get();
        employee.setCompany(company);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByCompany(Long companyId) {
        return employeeRepository.findByCompany_Id(companyId);
    }
}
