package com.spring_boot.spring_boot.Controller;

import com.spring_boot.spring_boot.Model.Course;
import com.spring_boot.spring_boot.Service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class courseController {
    @Autowired
    courseService service;

    @RequestMapping("/course")
    public List<Course> getCourses(){
        return service.getCourse();
    }
}
