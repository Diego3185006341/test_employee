package com.test.controller;

import MockFactory.MockFactory;
import com.test.Controller.EmployeeController;
import com.test.Entity.Employee;
import com.test.Service.Imp.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeControllerTest {


    @Mock
    EmployeeServiceImpl employeeService;

    @InjectMocks
    EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

    }

     @Test
     void getAllEmployees() {
         Mockito.when(employeeService.getAllEmployees()).thenReturn(MockFactory.listEmployeeMock());
         List<Employee> allEmployees = employeeController.getAllEmployees();
         assertNotNull(allEmployees);
     }

    @Test
    void getEmployeeById() {
        Long id = 123L;
        Mockito.when(employeeService.getEmployeeById(id)).thenReturn(MockFactory.EmployeeMock());
        Employee employee1 = employeeController.getEmployeeById(id);
        assertNotNull(employee1);
        assertEquals(employee1.getId(), id);
    }

}
