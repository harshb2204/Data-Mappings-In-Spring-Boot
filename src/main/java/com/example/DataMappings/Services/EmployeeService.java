package com.example.DataMappings.Services;

import com.example.DataMappings.Entities.EmployeeEntity;
import com.example.DataMappings.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;


@Service

public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }
}
