package com.test.Service.Imp;


import com.test.Entity.Employee;
import com.test.Util.EmployeeBusinessService;
import com.test.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {


    public List<Employee> getAllEmployees() {
        List<Employee> employees = getEmployees();
        employees.forEach(emp -> emp.setAnnual_salary(EmployeeBusinessService.computeAnnualSalary(emp.getEmployee_salary())));
        return employees;
    }

    public Employee getEmployeeById(Long id) {
            List<Employee> employees = getEmployees();
            Employee employee1 = employees.stream()
                    .filter(employee -> id.equals(employee.getId()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Employee with ID " + id + " not found"));
            employee1.setAnnual_salary(EmployeeBusinessService.computeAnnualSalary(employee1.getEmployee_salary()));
            return employee1;



    }

    private static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(101L, "Alice Brown", 8000, 28, "", 0),
                new Employee(102L, "Bob White", 9000, 32, "", 0),
                new Employee(103L, "Charlie Black", 10000, 40, "", 0)
        );
    }
}

