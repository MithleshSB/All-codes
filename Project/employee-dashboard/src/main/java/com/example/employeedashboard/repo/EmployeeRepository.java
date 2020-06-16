package com.example.employeedashboard.repo;

import com.example.employeedashboard.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
