package springbootcourse.albin.squeed.web.services;

import org.springframework.stereotype.Service;
import springbootcourse.albin.squeed.web.data.EmployeeRepository;
import springbootcourse.albin.squeed.web.models.Employee;
import springbootcourse.albin.squeed.web.models.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
