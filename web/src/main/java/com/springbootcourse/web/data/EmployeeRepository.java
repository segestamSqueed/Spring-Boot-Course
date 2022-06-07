package com.springbootcourse.web.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootcourse.web.models.Employee;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
