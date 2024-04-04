package com.example.springboot.learnjpaandhibernate.course;

import com.example.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.example.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    /*@Autowired
    private CourseJdbcRepository repository;*/

    /*@Autowired
    private CourseJpaRepository repository;*/

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn SQL", "BobaCode"));
        repository.save(new Course(2, "Learn DevOps", "Labzh"));
        repository.save(new Course(3, "Learn Java", "Robert Martin"));
        repository.deleteById(2L);
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findCoursesByAuthor("BobaCode"));
        System.out.println(repository.findCoursesByName("Learn Java"));
    }
}
