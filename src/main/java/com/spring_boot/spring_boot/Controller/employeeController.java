package com.spring_boot.spring_boot.Controller;

import com.spring_boot.spring_boot.Model.Employees;
import com.spring_boot.spring_boot.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class employeeController {

    @Autowired
    employeeService empl ;
    @RequestMapping("/emp")
    public List<Employees> showEmployees(){
        return empl.getEmp();
    }
}
