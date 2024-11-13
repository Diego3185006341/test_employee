package com.test.Service.Imp;

import com.test.Entity.Employee;
import com.test.FeignClient.EmployeeServiceClient;
import com.test.Service.DataAccessLayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DataAccessLayerServiceImp implements DataAccessLayerService {
    public final EmployeeServiceClient employeeServiceClient;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeServiceClient.getAllEmployees();
    }
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeServiceClient.getEmployeeById(id);
    }
}
