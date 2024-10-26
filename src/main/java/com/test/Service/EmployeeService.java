package com.test.Service;

import com.test.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee  getEmployeeById(Long id );
}
