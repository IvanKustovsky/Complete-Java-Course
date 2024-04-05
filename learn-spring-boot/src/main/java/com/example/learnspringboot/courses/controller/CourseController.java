package com.example.learnspringboot.courses.controller;

import com.example.learnspringboot.courses.model.Course;
import com.example.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getFirstCourse(@PathVariable long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        courseRepository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable long id){
        courseRepository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        courseRepository.deleteById(id);
    }
}
