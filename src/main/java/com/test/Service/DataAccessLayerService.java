package com.test.Service;

import com.test.Entity.Employee;

import java.util.List;
public interface DataAccessLayerService {

    List<Employee> getAllEmployee();

    Employee  getEmployeeById(Long id );
}
