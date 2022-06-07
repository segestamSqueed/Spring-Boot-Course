package springbootcourse.albin.squeed.web.services;

import org.springframework.stereotype.Service;
import springbootcourse.albin.squeed.web.models.Employee;
import springbootcourse.albin.squeed.web.models.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(UUID.randomUUID(), "John", "Doe", Position.CONCIERGE));
        employees.add(new Employee(UUID.randomUUID(), "Peter", "Doe", Position.FRONT_DESK));
        employees.add(new Employee(UUID.randomUUID(), "James", "Doe", Position.SECURITY));
        employees.add(new Employee(UUID.randomUUID(), "Jane", "Doe", Position.HOUSEKEEPING));
        employees.add(new Employee(UUID.randomUUID(), "Hanna", "Doe", Position.CONCIERGE));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

}
