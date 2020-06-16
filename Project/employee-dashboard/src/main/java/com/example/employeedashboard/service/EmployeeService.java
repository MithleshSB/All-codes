package com.example.employeedashboard.service;

import com.example.employeedashboard.model.Employee;

import java.util.Optional;

public interface EmployeeService {

    public Iterable<Employee> findAllEmployees();
    public Optional<Employee> findEmployeeById(int employeeId);
}
