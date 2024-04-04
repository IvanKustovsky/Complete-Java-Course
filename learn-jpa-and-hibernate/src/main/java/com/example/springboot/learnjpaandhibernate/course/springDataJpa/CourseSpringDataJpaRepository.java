package com.example.springboot.learnjpaandhibernate.course.springDataJpa;

import com.example.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

     List<Course> findCoursesByAuthor(String author);

    List<Course> findCoursesByName(String name);
}
