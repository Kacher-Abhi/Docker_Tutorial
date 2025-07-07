package com.example.docker_tutorial.service;

import com.example.docker_tutorial.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(UUID id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(UUID id);

}
