package com.test.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {

    private Long id;
    private String employee_name;
    private double employee_salary;
    private Integer employee_age;
    private String profile_image;
    private double annual_salary;


}
