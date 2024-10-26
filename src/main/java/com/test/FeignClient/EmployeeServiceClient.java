package com.test.FeignClient;

import com.test.Contants.Constants;
import com.test.Entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employeeClient", url = "${services.employees}")
public interface EmployeeServiceClient {

    @GetMapping(value = Constants.EMPLOYEES, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Employee> getAllEmployees();


    @GetMapping(value = Constants.GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Employee getEmployeeById(@PathVariable(name = Constants.EMPLOYEE_ID) Long id);

}
