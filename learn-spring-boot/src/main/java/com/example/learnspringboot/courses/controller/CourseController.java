package com.example.learnspringboot.courses.controller;

import com.example.learnspringboot.courses.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return List.of(new Course(1, "Learn Microservices", "Author"),
                new Course(2, "Learn Full Stack Dev", "Author2"));
    }

    @GetMapping("/courses/1")
    public Course getFirstCourse(){
        return new Course(19, "Learn Microservices", "Author");
    }
}
