package com.test.Service;

import com.test.Entity.Employee;
import com.test.Service.Imp.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeServiceImpTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    void getAllEmployees(){

        List<Employee> result = employeeService.getAllEmployees();

        assertEquals(3, result.size());
        assertEquals(101L, result.get(0).getId());
        assertEquals("Alice Brown", result.get(0).getEmployee_name());
        assertEquals(8000 * 12, result.get(0).getAnnual_salary());

    }
    @Test
    void getEmployeeById(){

        Long id = 101L;
        Employee employeeById = employeeService.getEmployeeById(id);

        assertNotNull(employeeById);
        assertEquals("Alice Brown", employeeById.getEmployee_name());

    }

}
