package com.example.employeeservice.proxy;

import com.example.employeeservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@FeignClient("employee-dashboard-service")
public interface EmployeeDashboardProxy {

    @GetMapping("/api/employees")
    public Iterable<Employee> proxyGetAllEmployee();
    @GetMapping("/api/employees/{employeeId}")
    public Optional<Employee> proxyGetEmployeeById(@PathVariable("employeeId") int employeeId);
}
