package com.springbootcourse.web.services;

import com.springbootcourse.web.data.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.springbootcourse.web.models.Employee;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

}
