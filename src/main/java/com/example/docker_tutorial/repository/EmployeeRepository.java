package com.example.docker_tutorial.repository;

import com.example.docker_tutorial.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    List<Employee> findByDepartment(String department);
}
