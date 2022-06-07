package springbootcourse.albin.squeed.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootcourse.albin.squeed.web.models.Employee;
import springbootcourse.albin.squeed.web.models.Room;
import springbootcourse.albin.squeed.web.services.EmployeeService;
import springbootcourse.albin.squeed.web.services.RoomService;

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
