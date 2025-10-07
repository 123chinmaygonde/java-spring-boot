package com.spring_boot.spring_boot.Service;

import com.spring_boot.spring_boot.Model.Course;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class courseService {

    public List<Course> courses = Arrays.asList(new Course(100,"Java",1000), new Course(200,"Javascript",20000),
             new Course(300,"python",30000), new Course(400,"Devops",40000));
    public List<Course> getCourse(){
        return courses;
    }
}
