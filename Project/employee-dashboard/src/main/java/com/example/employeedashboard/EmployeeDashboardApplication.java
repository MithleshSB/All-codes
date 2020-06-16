package com.example.employeedashboard;

import com.example.employeedashboard.model.Employee;
import com.example.employeedashboard.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeDashboardApplication implements CommandLineRunner {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeDashboardApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDashboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Mithlesh","Singh","python@email.com"));
        employeeRepository.save(new Employee("vivek","Singh","vsk@email.com"));
        employeeRepository.save(new Employee("Mukul","Negi","gravezero@email.com"));
        employeeRepository.save(new Employee("sagardeep","nandi","senpai@email.com"));

    }
}
