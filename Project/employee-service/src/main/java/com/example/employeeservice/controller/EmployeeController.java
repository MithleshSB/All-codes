package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.proxy.EmployeeDashboardProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {

    private EmployeeDashboardProxy employeeDashboardProxy;

    @Autowired
    public EmployeeController(EmployeeDashboardProxy employeeDashboardProxy) {
        this.employeeDashboardProxy = employeeDashboardProxy;
    }

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Employee>> getAll()
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeDashboardProxy.proxyGetAllEmployee());
    }
    @GetMapping(value = "/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Employee>> getOne(@PathVariable("employeeId") int employeeId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeDashboardProxy.proxyGetEmployeeById(employeeId));
    }
}
