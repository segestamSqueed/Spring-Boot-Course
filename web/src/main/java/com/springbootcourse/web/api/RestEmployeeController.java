package com.springbootcourse.web.api;

import com.springbootcourse.web.models.Employee;
import com.springbootcourse.web.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class RestEmployeeController {
    private final EmployeeService employeeService;

    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllRooms(){
        return employeeService.getAllEmployees();
    }
}
