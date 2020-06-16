package com.example.employeeservice.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
}
