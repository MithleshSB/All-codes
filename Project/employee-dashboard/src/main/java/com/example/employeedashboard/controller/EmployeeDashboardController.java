package com.example.employeedashboard.controller;

import com.example.employeedashboard.model.Employee;
import com.example.employeedashboard.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeDashboardController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeDashboardController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employees",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Employee>> getAllEmployees()
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.findAllEmployees());
    }
    @GetMapping(value = "/employees/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("employeeId") int employeeId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.findEmployeeById(employeeId));
    }








}
