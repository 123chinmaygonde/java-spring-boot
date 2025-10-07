package com.spring_boot.spring_boot.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employees {
    private int empId;
    private String empName;
    private String empLocation;
}
