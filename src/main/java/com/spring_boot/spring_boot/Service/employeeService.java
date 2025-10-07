package com.spring_boot.spring_boot.Service;

import com.spring_boot.spring_boot.Model.Employees;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class employeeService {

    public List<Employees> emp = Arrays.asList(new Employees(1,"ramesh","nagpur"),
       new Employees(2, "suresh","pune"), new Employees(3,"dinesh","mumbai"),
            new Employees(4,"mitesh","delhi"));
    public List<Employees> getEmp(){
        return emp;

    }
}
