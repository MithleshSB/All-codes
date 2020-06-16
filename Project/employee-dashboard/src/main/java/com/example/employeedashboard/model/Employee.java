package com.example.employeedashboard.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
