package com.spring_boot.spring_boot.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
