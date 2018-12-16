package com.example.demo.services;

import com.example.demo.Entities.CourseRepository;
import com.example.demo.topics.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String tid) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(tid).forEach(courses::add);
        return courses;
    }


    public Course getCourse(int cid) {
        return courseRepository.findById(cid).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);

    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }


}
