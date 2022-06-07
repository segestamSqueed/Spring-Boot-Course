package springbootcourse.albin.squeed.web.data;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootcourse.albin.squeed.web.models.Employee;
import springbootcourse.albin.squeed.web.models.Room;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
