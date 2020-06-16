package com.example.employeedashboard.service;

import com.example.employeedashboard.model.Employee;
import com.example.employeedashboard.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service("employeeService")
@EnableTransactionManagement
@EnableAutoConfiguration
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Iterable<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> findEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }
}
